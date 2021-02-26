package com.xupt.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/7 14:38
 */

public class ContextLoadListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {

        //读取Web.xml中的全局参数
        ServletContext servletContext = servletContextEvent.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app",app);
        System.out.println("spring容器创建完毕");

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}

