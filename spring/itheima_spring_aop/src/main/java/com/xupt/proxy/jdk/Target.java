package com.xupt.proxy.jdk;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 16:18
 */

public class Target implements TargetInterface{
    public void save() {
        System.out.println("save running.....");
    }
}
