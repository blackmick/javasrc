package com.shawn.finance.assetmanagement.controller;

import com.shawn.finance.assetmanagement.model.AssetManager;
import com.shawn.finance.assetmanagement.model.AssetPlan;
import com.shawn.finance.assetmanagement.service.AssetManagerService;
import com.shawn.finance.assetmanagement.service.AssetPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by shawn on 16/2/14.
 */
@Controller
public class AssetPlanController {
    @Autowired
    AssetPlanService assetPlanService;
    @Autowired
    AssetManagerService assetManagerService;

    @RequestMapping(value = "assetplan/list",method = RequestMethod.GET)
    public ModelAndView list(){
        ArrayList<AssetPlan> assetPlanList = (ArrayList<AssetPlan>) assetPlanService.getList(0,10);
        return new ModelAndView("assetplan/list", "plans", assetPlanList);
    }

    @RequestMapping(value = "assetplan/add",method= RequestMethod.GET)
    public ModelAndView add(){
        ArrayList<AssetManager> managers = (ArrayList<AssetManager>) assetManagerService.getList(0, 10);
        return new ModelAndView("assetplan/add", "managers", managers);
    }

    @RequestMapping(value = "assetplan/add",method= RequestMethod.POST)
    public ModelAndView add(@ModelAttribute AssetPlan assetPlan, Model model){
        //TODO:add new asset plan
        return new ModelAndView("redirect:assetplan/list");
    }
}
