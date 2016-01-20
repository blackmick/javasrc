package com.shawn.finance.fsmdemo.config;

import com.shawn.finance.fsmdemo.interceptor.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by shawn on 16/1/18.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Autowired
    RequestInterceptor requestInterceptor;

    @Override
    public void addInterceptor(InterceptorRegistry registry){
        
    }
}
