package com.xupt.aop;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 16:18
 */

public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running.....");
        int i=1/0;
    }
}
