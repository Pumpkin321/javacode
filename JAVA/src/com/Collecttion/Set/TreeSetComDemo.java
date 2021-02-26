package com.Collecttion.Set;

import com.Collecttion.Set.Stu;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 21:10
 */

public class TreeSetComDemo {
    public static void main(String[] args) {
        TreeSet<Stu> ts = new TreeSet<Stu>(new Comparator<Stu>() {
            @Override
            public int compare(Stu s1, Stu s2) {
                //this.age - s.age
                //s1,s2
                int num = s1.getAge()-s2.getAge();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        Stu s1 = new Stu("jack",12,99,100,92);
        Stu s2 = new Stu("jason",22,96,99,94);
        Stu s3 = new Stu("rose",33,98,98,95);
        Stu s4 = new Stu("kim",44,99,97,97);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Stu s:ts){
            System.out.println(s);
        }
    }
}
