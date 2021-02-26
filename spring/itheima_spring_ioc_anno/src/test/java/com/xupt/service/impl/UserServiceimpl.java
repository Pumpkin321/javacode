package com.xupt.service.impl;

import com.xupt.service.UserService;
import com.xupt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/30 17:32
 */

//    <bean id="userService" class="com.xupt.service.impl.UserServiceimpl" > </bean>
@Component("userService")
public class UserServiceimpl implements UserService {
    @Value("${jdbc.driver}")
    private String driver;

    //<property name="userDao" ref="userDao"></property>
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println(driver);
        userDao.save();
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("123");
//    }
}
