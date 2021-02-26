package com.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 16:58
 */

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2= num==0?s1.getChinese()-s2.getChinese():num;
                int num3 = num2==0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });

        for (int i = 0; i < 5; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请录入第"+(i+1)+"个学生的信息");
            String name = sc.nextLine();
            System.out.println("语文成绩");
            int chinese = sc.nextInt();
            System.out.println("数学成绩");
            int math = sc.nextInt();
            System.out.println("英语成绩");
            int english = sc.nextInt();
            Student s = new Student(name,chinese,math,english);
            ts.add(s);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\ArrayListtoTxt.txt"));

        for (Student s :ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append("的语文成绩：").append(s.getChinese()).append(",数学成绩：").append(s.getMath()).append(",英语成绩：").append(s.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();

    }
}
