package com.Collecttion.Generic;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 14:52
 */

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(10,20,30,40,50,60));
        System.out.println(sum(10,20,30,40,50,60,70));
    }

//一个方法有多个参数，包含可变参数，可变参数要放在最后
//    public static int sum(int b,int...a) {
//        return 0;
//    }

//可变参数实际是一个数组
    public static int sum(int ...a){
//        System.out.println(a);
//        return 0;
        int sum=0;
        for (int i :a){
            sum+=i;
        }
        return sum;
    }

}
