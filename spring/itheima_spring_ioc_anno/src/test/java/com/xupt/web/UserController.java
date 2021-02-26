package com.xupt.web;


import com.xupt.config.SpringConfigruationn;
import com.xupt.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/30 17:36
 */

public class UserController {
    public static void main(String[] args) {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfigruationn.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
