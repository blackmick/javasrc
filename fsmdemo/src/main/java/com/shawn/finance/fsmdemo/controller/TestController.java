package com.shawn.finance.fsmdemo.controller;

import com.shawn.finance.fsmdemo.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shawn on 15/12/29.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping(method = {RequestMethod.GET ,RequestMethod.POST})
    @ResponseBody
    public String test(){
        UserService us = new UserService();
        us.doApply();
        return "Test";
    }
}
