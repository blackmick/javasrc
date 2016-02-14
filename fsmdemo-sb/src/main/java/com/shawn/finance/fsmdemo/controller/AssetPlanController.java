package com.shawn.finance.fsmdemo.controller;

import com.shawn.finance.fsmdemo.model.AssetPlan;
import com.shawn.finance.fsmdemo.service.AssetPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by shawn on 16/2/14.
 */
@Controller
public class AssetPlanController {
    @Autowired
    AssetPlanService assetPlanService;

    @RequestMapping(value = "assetplan/list")
    public ModelAndView list(){
        ArrayList<AssetPlan> assetPlanList = (ArrayList<AssetPlan>) assetPlanService.getList(0,10);
        return new ModelAndView("assetplan/list", "plans", assetPlanList);
    }
}
