package com.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 16:47
 */

public class TxtToArrayListDemo02 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<Student>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\ArrayListtoTxt.txt"));

        String line;
        while ((line=br.readLine())!=null){
            String[] strArray = line.split(",");
            Student s = new Student();
            s.setName(strArray[0]);
            s.setAge(Integer.parseInt(strArray[1]));
            s.setAddress(strArray[2]);
            array.add(s);
        }
        br.close();
        for (Student s :array){
            System.out.println(s);
        }

    }
}
