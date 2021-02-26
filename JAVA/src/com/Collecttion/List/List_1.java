package com.Collecttion.List;

import com.Collecttion.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/7 14:59
 */

public class List_1 {
    public static void main(String[] args) {
//        List<String> l = new ArrayList<String>();
//        l.add("hello");
//        l.add("you");
//
//        Iterator<String> it = l.iterator();
//        while (it.hasNext()){
//            String  s = it.next();
//            System.out.println(s);
//        }
//        System.out.println(l.get(1));
        List<Student> list= new ArrayList<Student>();
        Student s1 = new Student("jack",12);
        Student s2 = new Student("rose",22);

        list.add(s1);
        list.add(s2);

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
        for (int i=0;i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s);
        }

        ListIterator<Student> lit= list.listIterator();
        while (lit.hasNext()){
            Student s = lit.next();
            if (s.equals(s1));
            {
                lit.add(s2);
            }
        }
        System.out.println(list);

    }
}
