package com.shawn.finance.assetmanagement.service;

import com.shawn.finance.assetmanagement.model.Asset;
import com.sun.istack.internal.NotNull;
import org.apache.commons.logging.Log;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by shawn on 16/2/14.
 */
public class ExcelService {
    private Logger logger = LoggerFactory.getLogger(ExcelService.class);

    private class ConfigMap{
        private HashMap<String,String> headMap;
        private HashMap<String,String> propertiesMap;

        public void setHeadMap(HashMap<String, String> map){
            this.headMap = map;
        }

        public HashMap<String, String> getHeadMap(){
            return this.headMap;
        }

        public void setPropertiesMap(HashMap<String, String> map){
            this.propertiesMap = map;
        }

        public HashMap<String, String> getPropertiesMap(){
            return this.propertiesMap;
        }
    }


    public void loadMap(String fileName){
        Yaml yaml = new Yaml();
        try{
            Cell cell = null;
            HashMap<String,Object> map = (HashMap<String, Object>)yaml.load(new FileInputStream(fileName));
            Map<String,String> headMap = (HashMap<String, String>)map.get("head");
            Map<String, String> propertiesMap = (HashMap<String, String>)map.get("properties");

            Set<String> keys = headMap.keySet();
            for(String key : keys){
                int colIdx = Integer.parseInt(key);
                String head = headMap.get(key);
            }
//            HashMap<String, String> headMap = (HashMap<String, String>) yaml.load(map.get("head").toString());
            logger.info(headMap.toString());
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
            Workbook workbook = new XSSFWorkbook();
            Sheet sheetPeriod = workbook.createSheet();
            short rowIdx = 0;
//            short cellIdx = 0;
            Row row = sheetPeriod.createRow((short)rowIdx++);
            formatHeadRow(row);
            for (Asset asset : list){
                row = sheetPeriod.createRow(rowIdx);
                this.formatRow(row, asset);
                rowIdx++;
            }

            return workbook;
        }catch (Exception ex){
            logger.error(ex.getMessage());
            return null;
        }

    }

    private Row formatHeadRow(Row row){
        Cell cell = null;
        cell = row.createCell(0);
        cell.setCellValue("");
        return row;
    }

    private Row formatRow(Row row, final Asset asset){
        Cell cell;
        return row;
    }
}
