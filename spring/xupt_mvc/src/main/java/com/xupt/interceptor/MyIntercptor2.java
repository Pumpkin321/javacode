package com.xupt.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/9 18:07
 */

public class MyIntercptor2 implements HandlerInterceptor {
    //在目标方法执行前执行拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle2222");
        return true;
//        return true;//返回true放行 返回false 不放行
    }
    //在目标方法执行之后 视图返回前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle22222");
    }
    //在目标方法执行后 视图返回之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion222222");
    }
}
