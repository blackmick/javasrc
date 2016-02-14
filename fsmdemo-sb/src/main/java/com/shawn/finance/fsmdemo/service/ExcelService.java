package com.shawn.finance.fsmdemo.service;

import com.shawn.finance.fsmdemo.model.Asset;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

/**
 * Created by shawn on 16/2/14.
 */
public class ExcelService {
    private Logger logger = LoggerFactory.getLogger(ExcelService.class);

    public boolean write2Excel(List<Asset> list,String fileName, boolean refresh){
        if (!refresh && isExcelFileExist(fileName)){
            return false;
        }

        try{
            Workbook workbook = new XSSFWorkbook();

            Sheet sheet = workbook.createSheet();

            for (Asset asset : list){
                Row row = sheet.createRow(sheet.getLastRowNum());
                Cell cell = row.createCell(row.getLastCellNum());
                cell.setCellValue(1);
            }
            
            FileOutputStream fos = new FileOutputStream(fileName);
            workbook.write(fos);
            fos.close();
            workbook.close();
        }catch (Exception e){
            e.getMessage();
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
}
