package com.Collecttion.Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 22:05
 */

public class TreeSetGradeSortDemo {
    public static void main(String[] args) {
        TreeSet<Stu> ts = new TreeSet<Stu>(new Comparator<Stu>() {
            @Override
            public int compare(Stu s1, Stu s2) {
                int num= s2.getNum()-s1.getNum();
                int num2 = num==0 ? s2.getChineseGrade()-s1.getChineseGrade():num;
                int num3 = num2==0? s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });

        Stu s1 = new Stu("jack",12,93,100,92);
        Stu s2 = new Stu("jason",22,96,99,94);
        Stu s3 = new Stu("rose",33,98,98,95);
        Stu s4 = new Stu("kim",44,99,97,97);
        Stu s5 = new Stu("susan",42,98,98,97);
        Stu s6 = new Stu("micky",42,98,97,98);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Stu s :ts){
            System.out.println(s);
            System.out.println(s.getNum());
        }
    }
}
