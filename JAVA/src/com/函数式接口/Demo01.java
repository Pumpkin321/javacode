package com.函数式接口;

import cominterface.Myinterface;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 15:42
 */
/*
函数式接口 有且仅有一个抽象方法的接口

常用函数式接口
Supplier
Consumer
PredicateDemo
Function
 */
public class Demo01 {
    public static void main(String[] args) {
        Myinterface mi = ()-> System.out.println("函数式接口");
        mi.show1();
    }
}
