package com.shawn.finance.fsmdemo;

import com.shawn.finance.fsmdemo.model.Asset;
import com.shawn.finance.fsmdemo.service.ExcelService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;

/**
 * Created by shawn on 15/12/24.
 */

//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    public static void main(String [] args){
//        SpringApplication.run(Application.class);
        ExcelService es = new ExcelService();
        ArrayList<Asset> list = new ArrayList<Asset>();
        list.add(new Asset());
        list.add(new Asset());
        es.write2Excel(list, "/tmp/test.xlsx", true);
    }

}
