package com.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 12:59
 */
/*
FileOutputStream 文件输出流用于将数据写入File
FileOutputStream(String name)
创建文件输出流以指定的名称写入文件。
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream(String name)
        //创建文件输出流以指定的名称写入文件。
        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt");
        //void write(int b)
        //将指定的字节写入此文件输出流。
        fos.write(97);
        //使用完毕后需要释放资源
        //close()
        //关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos.close();
    }
}
