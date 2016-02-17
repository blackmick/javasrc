package com.shawn.finance.assetmanagement.service;

import com.shawn.finance.assetmanagement.model.Asset;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by shawn on 16/2/14.
 */
public class ExcelService {
    private Logger logger = LoggerFactory.getLogger(ExcelService.class);

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
}
