package com.xupt.demo;

import com.xupt.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/30 15:12
 */

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.XML");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();

    }
}
