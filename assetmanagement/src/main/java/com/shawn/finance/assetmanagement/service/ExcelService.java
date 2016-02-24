package com.shawn.finance.assetmanagement.service;

import com.shawn.finance.assetmanagement.model.Asset;
import com.sun.istack.internal.NotNull;
import org.apache.commons.logging.Log;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

/**
 * Created by shawn on 16/2/14.
 */
public class ExcelService {
    private Logger logger = LoggerFactory.getLogger(ExcelService.class);

//    private class ConfigMap{
//        private HashMap<String,String> headMap;
//        private HashMap<String,String> propertiesMap;
//
//        public void setHeadMap(HashMap<String, String> map){
//            this.headMap = map;
//        }
//
//        public HashMap<String, String> getHeadMap(){
//            return this.headMap;
//        }
//
//        public void setPropertiesMap(HashMap<String, String> map){
//            this.propertiesMap = map;
//        }
//
//        public HashMap<String, String> getPropertiesMap(){
//            return this.propertiesMap;
//        }
//    }

    private Map<Integer, String> headers = null;

    private Map<Integer, String> columnMapper = null;

    private String className = null;


    public void loadMap(String fileName){
        Yaml yaml = new Yaml();
        try{
            HashMap<String,Object> map = (HashMap<String, Object>)yaml.load(new FileInputStream(fileName));

            this.headers = (HashMap<Integer, String>)map.get("head");
            this.columnMapper = (HashMap<Integer, String>)map.get("properties");
            this.className = (String)map.get("class");

            logger.info("HEADERS:[{}]",this.headers);
        }catch (Exception ex){
            logger.error(ex.getMessage());
        }
    }

    public boolean write2Excel(List<Asset> list,String fileName, boolean refresh){
        if (!refresh && isExcelFileExist(fileName)){
            logger.warn("refresh is false, but the file[{}] is exist, exit", fileName);
            return false;
        }

        try{
            Workbook workbook = new XSSFWorkbook();

            Sheet sheet = workbook.createSheet();
            short rowIdx = 0;
            short cellIdx = 0;
            for (Asset asset : list){
                Row row = sheet.createRow(rowIdx);
                cellIdx = 0;
                {
                    Cell cell = row.createCell(cellIdx);
                    cell.setCellValue(2);
                    cellIdx++;
                }
                rowIdx++;
            }

            File outputFile = new File(fileName);
            if (!outputFile.exists())
                outputFile.createNewFile();
            
            FileOutputStream fos = new FileOutputStream(outputFile);
            workbook.write(fos);
            fos.close();
            workbook.close();
        }catch (Exception e){
            logger.warn(e.getMessage());
        }
        return true;
    }

    public boolean isExcelFileExist(String path){
        File file = new File(path);
        return file.exists();
    }

    public List<Asset> load(String fileName){
        return null;
    }

    public Workbook getWorkbook(List<Asset> list){
        try{
            Workbook workbook = new HSSFWorkbook();
            Sheet sheetPeriod = workbook.createSheet();
            short rowIdx = 0;
//            short cellIdx = 0;
            Row row = sheetPeriod.createRow((short)rowIdx++);
            formatHeadRow(row);
//            for (Asset asset : list){
//                row = sheetPeriod.createRow(rowIdx);
//                this.formatRow(row, asset);
//                rowIdx++;
//            }

            return workbook;
        }catch (Exception ex){
            logger.error(ex.getMessage());
            ex.printStackTrace();
            return null;
        }

    }

    private Row formatHeadRow(Row row){
        if (this.headers == null){
            throw new NullPointerException("Header is not defined.");
        }

        Cell cell = null;

        int cellIdx = 0;
        Set<Integer> keys = this.headers.keySet();
        Iterator it = keys.iterator();
        while(it.hasNext()){
            Integer columnNo = (Integer) it.next();
            String headerTitle = this.headers.get(columnNo);
            cellIdx = columnNo.intValue();
            cell = row.createCell(cellIdx);
            cell.setCellValue(headerTitle);
        }

        return row;
    }

    private Row formatRow(Row row, final Asset asset){
        if (this.columnMapper == null){
            throw new NullPointerException("Header is not defined.");
        }

        Cell cell = null;
        int cellIdx = 0;
        Set<Integer> keys = this.columnMapper.keySet();
        for(Integer key: keys){
            String cellValue = this.columnMapper.get(key);
            cellIdx = key.intValue();
            cell = row.createCell(cellIdx);
            cell.setCellValue(cellValue);
        }

        return row;
    }
}
