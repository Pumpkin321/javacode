package com.Collecttion.Generic;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 13:56
 */
/*
泛型类：
格式：修饰符 class 类名<>类型{}
范例：public class Generic<T>{}
 */
public class GenericClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("jack");

        System.out.println(s1.getName());

        Teacher t1 = new Teacher();
        t1.setAge(12);

        System.out.println(t1.getAge());
        System.out.println("-----------------");

        GenericTDemo<String> g1 = new GenericTDemo<String>();
        g1.setT("jason");
        System.out.println(g1.getT());

        GenericTDemo<Integer> g2 = new GenericTDemo<Integer>();
        g2.setT(20);
        System.out.println(g2.getT());
    }
}
