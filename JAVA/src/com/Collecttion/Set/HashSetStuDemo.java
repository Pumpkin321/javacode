package com.Collecttion.Set;

import com.Collecttion.Student;

import java.util.HashSet;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 20:39
 */

public class HashSetStuDemo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("jack",12);
        Student s2 = new Student("rose",22);
        Student s3 = new Student("rose",22);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student s:hs){
            System.out.println(s);
        }
    }
}
