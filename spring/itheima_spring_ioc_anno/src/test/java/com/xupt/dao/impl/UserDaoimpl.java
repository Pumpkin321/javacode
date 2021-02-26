package com.xupt.dao.impl;

import com.xupt.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/30 17:31
 */
//<bean id="userDao" class="com.xupt.dao.impl.UserDaoimpl" ></bean>
@Component("userDao")
public class UserDaoimpl implements UserDao {
    public void save() {
        System.out.println("save running....");
    }
}
