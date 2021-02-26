package com.Collecttion.Set;

import com.Collecttion.Student;

import java.util.TreeSet;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 20:54
 */

public class TreeSetStuDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet= new TreeSet<Student>();

        Student s1 = new Student("jack",16);
        Student s2 = new Student("cook",22);
        Student s3 = new Student("rose",17);
        Student s4 = new Student("cose",17);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        for (Student s:treeSet){
            System.out.println(s);
        }
    }
}
