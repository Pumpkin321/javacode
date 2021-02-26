package com.Collecttion.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 16:30
 */

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("java");
        set.add("me");

        for (String s:set) {
            System.out.println(s);
        }
    }
}
