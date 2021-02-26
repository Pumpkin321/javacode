package com.xupt.factory;

import com.xupt.dao.UserDao;
import com.xupt.dao.impl.UserDaoImpl;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/30 15:43
 */

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
