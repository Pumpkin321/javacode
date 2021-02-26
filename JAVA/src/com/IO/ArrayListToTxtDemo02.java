package com.IO;
import com.IO.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 16:33
 */

public class ArrayListToTxtDemo02 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\ArrayListtoTxt.txt"));

        Student s1 = new Student("jason",12,"西安");
        Student s2 = new Student("tim",14,"北京");
        Student s3 = new Student("jason",16,"广州");
        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (Student s :array){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
