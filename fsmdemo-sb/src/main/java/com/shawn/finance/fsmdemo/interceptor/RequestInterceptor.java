package com.shawn.finance.fsmdemo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
<<<<<<< HEAD
import org.springframework.core.NamedThreadLocal;
=======
import org.springframework.context.annotation.Bean;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;
>>>>>>> ebb960eaf68333e6bf9b2d1715c2a75ff7f2274c
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by shawn on 16/1/18.
 */
<<<<<<< HEAD
public class RequestInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);
    private static final NamedThreadLocal<Long> TL_TIME = new NamedThreadLocal<Long>("RequestCostTime");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        TL_TIME.set(System.currentTimeMillis());
=======
@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {
    private static Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);
    private static NamedThreadLocal<Long> TL_TIMING = new NamedThreadLocal<Long>("Timing");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception{
        TL_TIMING.set(System.currentTimeMillis());
>>>>>>> ebb960eaf68333e6bf9b2d1715c2a75ff7f2274c
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
        throws Exception{
<<<<<<< HEAD
        try {
            long cost = System.currentTimeMillis() - TL_TIME.get();
            logger.warn("REQUEST URI:[{}] cost:[{}]", request.getRequestURI(), cost);
        }finally {
            TL_TIME.remove();
        }
=======
        long cost = System.currentTimeMillis() - TL_TIMING.get();
        logger.warn("REQ[{}] cost [{}]", request.getRequestURI(), cost);
>>>>>>> ebb960eaf68333e6bf9b2d1715c2a75ff7f2274c
    }
}
