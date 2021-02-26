package com.Collecttion.Set;

import java.util.LinkedHashSet;


/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 20:43
 */
/*
    LinkedHashSet特点
    1由哈希表和链表实现的Set接口，具有可预测的迭代次序
    2由链表保证有序，存储和取出顺序一致
    3由哈希表保证元素唯一，也就是说没有重复元素

 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        System.out.println(linkedHashSet);
        for (String s :linkedHashSet)
        {
            System.out.println(s);
        }
    }
}
