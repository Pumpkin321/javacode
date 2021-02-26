package com.IO.BufferedStream;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 15:41
 */
/*
字符缓冲流特有功能
BufferedWriter
newLine()
写一行行分隔符。

BufferedReader
readLine()
读一行文字。
 */
public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\BufferedStream\\bw.txt"));

//        for (int i = 0; i < 10 ; i++) {
//            bw.write("hello"+i);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\BufferedStream\\bw.txt"));
//        String line = br.readLine();
//        System.out.println(line);

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
