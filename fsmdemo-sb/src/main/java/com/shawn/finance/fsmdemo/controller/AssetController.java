package com.shawn.finance.fsmdemo.controller;

import com.shawn.finance.fsmdemo.model.Asset;
import com.shawn.finance.fsmdemo.service.AssetService;
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
    private AssetService assetService;
    @RequestMapping("asset/list")
    public ModelAndView list(){
        ArrayList<Asset> assetList = (ArrayList<Asset>)assetService.getList(0,10);
        return new ModelAndView("asset/list", "list", assetList);
    }
}
