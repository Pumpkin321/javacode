package com.xupt.SpringTest;

import com.xupt.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/30 15:23
 */

public class test {
    @Test
    public void test1(){
        ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.XML");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
    }

}
