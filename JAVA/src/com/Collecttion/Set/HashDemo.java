package com.Collecttion.Set;

import com.Collecttion.Student;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 16:33
 */
/*
 哈希值
 Object类中有一个方法可以获取对象的哈希值
 public int hashCode();返回对象的哈希值
 */

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("jim",12);
        Student s2 = new Student("jim",12);
        System.out.println(s1.hashCode());
        //默认情况下，不同对象的哈希值不相同
        //可以通过方法重写，实现不同对象的哈希值相同
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

    }
}
