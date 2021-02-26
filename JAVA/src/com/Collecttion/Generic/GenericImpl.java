package com.Collecttion.Generic;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 14:39
 */

public class GenericImpl<T> implements Generic_imp<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
