package com.xupt.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/7 14:54
 */

public class WebApplicationContextUtils {

    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }

}
