package com.xupt.dao.impl;

import com.xupt.dao.UserDao;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/30 15:09
 */

public class UserDaoImpl implements UserDao {
    private int age;
    private List<String> arr;

    public void setArr(List<String> arr) {
        this.arr = arr;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建····");
    }
    public void init(){
        System.out.println("初始化方法...");
    }
    public void destroy(){
        System.out.println("销毁方法...");
    }

    public void save() {
        System.out.println(arr);
        System.out.println("age="+age);
        System.out.println("save running ```````");
    }
}
