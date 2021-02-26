package com.xupt.service.impl;

import com.xupt.dao.UserDao;
import com.xupt.service.UserService;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/2 17:44
 */

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.save();
    }
}
