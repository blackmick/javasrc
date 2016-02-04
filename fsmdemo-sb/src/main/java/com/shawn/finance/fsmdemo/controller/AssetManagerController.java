package com.shawn.finance.fsmdemo.controller;

import com.shawn.finance.fsmdemo.model.AssetManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by shawn on 16/2/4.
 */
@Controller
public class AssetManagerController {
    @RequestMapping(value="/assetmanager/list", method = RequestMethod.GET)
    public ModelAndView list(){
        ArrayList<AssetManager> managers = new ArrayList<AssetManager>();
        AssetManager manager = new AssetManager();
        manager.setId(Long.valueOf(1000));
        manager.setName("Testname");
        manager.setBankName("TestBank");
        manager.setBranchBankName("Brank bank");
        manager.setBankAccount("0111222321203");
        managers.add(manager);

        return new ModelAndView("assetmanager/list", "managers", managers);
    }
}
