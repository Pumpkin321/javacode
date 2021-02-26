package com.xupt.demo;

import com.xupt.service.UserService;
import com.xupt.service.servImpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/30 15:53
 */

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.XML");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();

    }
}
