package com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 13:40
 */
/*
FileInputStreamDemo(String name)
通过打开与实际文件的连接来创建一个 FileInputStreamDemo ，该文件由文件系统中的路径名 name命名。

读数据方法：
read()
从该输入流读取一个字节的数据。
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创捷字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt");
        //read()
        //从该输入流读取一个字节的数据。
//        int by = fis.read();
//        System.out.println((char)by);
//        int by = fis.read();
//        while (by!=-1){
//            System.out.print((char)by);
//            by=fis.read();
//        }
        //优化程序
        int by;
        while((by=fis.read())!=-1){
            System.out.print((char)by);
        }
        //关闭资源
        fis.close();
    }
}
