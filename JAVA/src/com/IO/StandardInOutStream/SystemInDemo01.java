package com.IO.StandardInOutStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 11:29
 */
/*
public static final InputStream in
“标准”输入流。 该流已经打开，准备提供输入数据。 通常，该流对应于键盘输入或由主机环境或用户指定的另一个输入源。

 */
public class SystemInDemo01 {
    public static void main(String[] args) throws IOException {
        //public static final InputStream in
//        InputStream is = System.in;
//        int by;
//        while ((by=is.read())!=-1){
//            System.out.print((char)by);
//        }
        //使用转换流将字节流转为字符流
//        InputStreamReader isr = new InputStreamReader(is);
        //使用字符流能否实现一次读取一行数据？可以
        //一次读取一行数据的方法是字符缓冲流的特有方法
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串");
        String line = br.readLine();
        System.out.println("你输入的是："+line);
    }
        Scanner sc = new Scanner(System.in);
}
