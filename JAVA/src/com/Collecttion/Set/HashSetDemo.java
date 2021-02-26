package com.Collecttion.Set;

import java.util.HashSet;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 20:06
 */
/*
    Set特点：不包含重复
            没有带索引方法，不可以使用普通for循环
    Hashset特点：底层数据结构是哈希表
    对集合的迭代顺序不保证，不保证存储和取出顺序一致
    没有带索引的方法，不可以使用普通for循环
    不可以包含重复元素
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");

        for (String s : hs){
            System.out.println(s);
        }
    }
}
