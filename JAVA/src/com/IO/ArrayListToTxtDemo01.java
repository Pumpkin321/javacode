package com.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 16:12
 */
/*
把ArrayList集合中的字符串数据写入到文本文件 要求：每一字符串元素作为文件中的一行数据
 */
public class ArrayListToTxtDemo01 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("javase");

        BufferedWriter bw =new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\ArrayListtoTxt.txt"));
        for (String s :array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
