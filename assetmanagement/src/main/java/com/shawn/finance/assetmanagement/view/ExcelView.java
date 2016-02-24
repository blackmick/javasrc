package com.shawn.finance.assetmanagement.view;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.AbstractView;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by shawn on 16/2/24.
 */
public class ExcelView extends AbstractExcelView {
    @Override
    public void buildExcelDocument(Map<String,Object> obj, HSSFWorkbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception{
        String fileName = "资产数据.xls";
        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition", "attachment; filename="+ URLEncoder.encode(fileName, "UTF-8"));
        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }
}
