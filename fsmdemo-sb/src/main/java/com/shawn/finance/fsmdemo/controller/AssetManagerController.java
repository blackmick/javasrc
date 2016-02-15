package com.shawn.finance.fsmdemo.controller;

import com.shawn.finance.fsmdemo.model.AssetManager;
import com.shawn.finance.fsmdemo.service.AssetManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by shawn on 16/2/4.
 */
@Controller
public class AssetManagerController {
    @Autowired
    AssetManagerService assetManagerService;

    @RequestMapping(value="/assetmanager/list", method = RequestMethod.GET)
    public ModelAndView list(){
        ArrayList<AssetManager> managers = (ArrayList<AssetManager>) assetManagerService.getList(0, 10);
        return new ModelAndView("assetmanager/list", "managers", managers);
    }

    @RequestMapping(value="/assetmanager/list", method = RequestMethod.POST)
    public ModelAndView list(@RequestParam("managerName")String name, @RequestParam("bankName")String bankName){
        ArrayList<AssetManager> managers = (ArrayList<AssetManager>) assetManagerService.getList(0, 10);
        return new ModelAndView("assetmanger/list", "mangaers", managers);
    }
}
