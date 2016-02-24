package com.shawn.finance.assetmanagement.controller;

import com.shawn.finance.assetmanagement.model.Asset;
import com.shawn.finance.assetmanagement.service.AssetDetailService;
import com.shawn.finance.assetmanagement.service.ExcelService;
import com.shawn.finance.assetmanagement.view.ExcelView;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Created by shawn on 16/2/14.
 */
@Controller
public class AssetController {
    @Autowired
    private AssetDetailService assetDetailService;

    private Logger logger = LoggerFactory.getLogger(AssetController.class);
    @RequestMapping("asset/list")
    public ModelAndView list(){
        ArrayList<Asset> assetList = (ArrayList<Asset>) assetDetailService.getList(0,10);
        return new ModelAndView("assetplan/detail", "list", assetList);
    }

    @RequestMapping("asset/excel")
    public ModelAndView exportExcel(Model model, HttpServletRequest request, HttpServletResponse response){
        ExcelService es = new ExcelService();
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String file = cl.getResource("config/excel.yaml").getFile();
        es.loadMap(file);
        ExcelView ev = new ExcelView();
        try{
            ev.buildExcelDocument(null,(HSSFWorkbook)es.getWorkbook(null),request, response);
        }catch (Exception ex){
            logger.info(ex.getMessage());
        }
        return new ModelAndView(new ExcelView(), null);
    }
}
