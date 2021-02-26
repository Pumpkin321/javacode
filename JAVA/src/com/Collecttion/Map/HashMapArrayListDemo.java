package com.Collecttion.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 16:38
 */

/*
创建一个HashMap集合 存储三个键值对 键都是String 值都是ArrayList每一个ArrayList的值都是String 并遍历

1创建HashMap集合
2创建ArrayList集合 添加元素
3把ArrayList作为元素添加到HashMap
4遍历HashMap
 */
public class HashMapArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("jim");
        arr1.add("tim");
        hm.put("arr001",arr1);

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("cook");
        arr2.add("coke");
        hm.put("arr002",arr2);

        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("adam");
        arr3.add("ekko");
        hm.put("arr003",arr3);

        Set<String> keySet = hm.keySet();
        for (String key : keySet){
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value){
                System.out.println(s);
            }
        }
    }
}
