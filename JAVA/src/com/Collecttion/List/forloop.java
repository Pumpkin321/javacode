package com.Collecttion.List;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/7 16:09
 */

public class forloop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i :arr) {
            System.out.println(i);
        }

        String[] Stringarr = {"a","b","c"};
        for (String s :Stringarr) {
            System.out.println(s);
        }
        List<String> list = new ArrayList<String >();
        list.add("hello");
        list.add("my");
        list.add("friend");
        for (String s:list) {
            System.out.println(s);
        }
    }
}
