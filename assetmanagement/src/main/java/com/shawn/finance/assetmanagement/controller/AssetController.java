package com.shawn.finance.assetmanagement.controller;

import com.shawn.finance.assetmanagement.model.Asset;
import com.shawn.finance.assetmanagement.service.AssetDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by shawn on 16/2/14.
 */
@Controller
public class AssetController {
    @Autowired
    private AssetDetailService assetDetailService;
    @RequestMapping("asset/list")
    public ModelAndView list(){
        ArrayList<Asset> assetList = (ArrayList<Asset>) assetDetailService.getList(0,10);
        return new ModelAndView("assetplan/detail", "list", assetList);
    }
}