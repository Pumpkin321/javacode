package com.xupt.proxy.jdk;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 16:20
 */

public class Advice {

    public void before(){
        System.out.println("前置增强");
    }

    public void afterReturning(){
        System.out.println("后置增强");
    }
}
