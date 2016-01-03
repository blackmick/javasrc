package com.shawn.finance.fsmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shawn on 15/12/29.
 */
@Controller("/test/")
public class TestController {
    @RequestMapping("/")
    public String test(){
        System.out.println("Test");
        return "Test";
    }
}
