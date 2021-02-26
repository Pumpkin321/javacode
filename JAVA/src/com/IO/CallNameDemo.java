package com.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 16:18
 */
/*
点名器
 */
public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\ArrayListtoTxt.txt"));
        ArrayList<String > array = new ArrayList<String >();

        String line;
        while((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();

        Random rd = new Random();
        int index = rd.nextInt(array.size());
        String name = array.get(index);
        System.out.println("被选中的是："+name);

    }
}
