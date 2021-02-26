package com.Collecttion.List;

import com.Collecttion.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/7 16:33
 */
/*
List特点：有序数组 可重复
ArrayList特点：底层数据结构是数组
查询快 增删慢
 */
public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("jack",12);
        Student s2 = new Student("rose",13);
        Student s3 = new Student("duck",14);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<Student> it = array.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s);
        }

        for (Student s:array) {
            System.out.println(s);
        }
    }
}
