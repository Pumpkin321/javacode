package com.Collecttion.Set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.Set;
/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 22:26
 */
/*
    编写一个程序，获取10个1-20的随机数，不能重复

    1创建set
    2创建随机数
    3判断Set长度
    4遍历
 */
public class SetRandomNumDedmo {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set = new TreeSet<Integer>();
        Random r = new Random();
        while (set.size()<10){
            int number = r.nextInt(20) + 1;
            set.add(number);
        }
        for (Integer i :set){
            System.out.println(i);
        }
    }
}
