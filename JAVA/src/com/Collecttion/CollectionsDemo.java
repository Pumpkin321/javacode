package com.Collecttion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 17:01
 */
/*
Collections 是针对集合操作的工具类

常用方法:

 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(50);
        list.add(20);
        list.add(10);
        list.add(60);
        list.add(30);
        list.add(40);

//        Collections.sort(list);//排序
//        Collections.reverse(list);//反转
//        Collections.shuffle(list);//随机置换
        System.out.println(list);

    }
}
