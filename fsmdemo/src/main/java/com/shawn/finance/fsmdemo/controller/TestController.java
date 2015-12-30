package com.shawn.finance.fsmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shawn on 15/12/29.
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String test(){
        return "Test";
    }
}
