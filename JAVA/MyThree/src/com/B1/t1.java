package com.B1;

import impl.MyService;

import java.util.ServiceLoader;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/24 15:25
 */

public class t1 {
    public static void main(String[] args) {
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        for (MyService my : myServices){
            my.service();
        }
    }
}
