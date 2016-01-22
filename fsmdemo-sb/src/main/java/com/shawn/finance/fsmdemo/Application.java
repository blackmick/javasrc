package com.shawn.finance.fsmdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
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
        SpringApplication.run(Application.class);
    }
}
