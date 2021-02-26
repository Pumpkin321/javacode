package com.Collecttion.Set;

import java.util.TreeSet;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 20:49
 */
/*
    TreeSet特点：有序（按一定规则排序） 无重复
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(28);
        treeSet.add(23);
        treeSet.add(1);
        treeSet.add(28);
        for (Integer i : treeSet){
            System.out.println(i);
        }
    }
}
