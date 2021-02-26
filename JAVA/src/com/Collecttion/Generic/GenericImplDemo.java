package com.Collecttion.Generic;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 14:40
 */

public class GenericImplDemo {
    public static void main(String[] args) {
        Generic_imp<String> g1 = new GenericImpl<String>();
        g1.show("jim");
        Generic_imp<Integer> g2 = new GenericImpl<Integer>();
        g2.show(12);
    }
}
