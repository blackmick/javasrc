package com.shawn.finance.fsmdemo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by shawn on 16/1/18.
 */
@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {
    private static Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);
    private static NamedThreadLocal<Long> TL_TIMING = new NamedThreadLocal<Long>("Timing");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception{
        TL_TIMING.set(System.currentTimeMillis());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
        throws Exception{
        try {
            long cost = System.currentTimeMillis() - TL_TIMING.get();
            logger.warn("REQUEST URI:[{}] cost:[{}]", request.getRequestURI(), cost);
        }finally {
            TL_TIMING.remove();
        }
    }
}
