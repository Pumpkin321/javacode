package com.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 13:07
 */
/*
FileOutputStream(String name)
创建文件输出流以指定的名称写入文件。
FileOutputStream(File file)
创建文件输出流以写入由指定的 File对象表示的文件。

字节流写数据的三种方式
write(byte[] b)
将 b.length个字节从指定的字节数组写入此文件输出流。
void write(byte[] b, int off, int len)
将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。
void write(int b)
将指定的字节写入此文件输出流。
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt");
        //new File(name)
//        FileOutputStream fos = new FileOutputStream(new File("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt"));
//        File file = new File("D:\\找工作\\JAVA\\src\\com\\IO\\fos2.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);
//        FileOutputStream fos2 = new FileOutputStream(new File("D:\\找工作\\JAVA\\src\\com\\IO\\fos2.txt"));

        //void write(int b)
        //将指定的字节写入此文件输出流。
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);

        //write(byte[] b)
        //将 b.length个字节从指定的字节数组写入此文件输出流。
//        byte[] bytes = {97,98,99,100,101};
        //使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
        byte[] bytes = "abcdefg".getBytes();
//        fos.write(bytes);

        //void write(byte[] b, int off, int len)
        //将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。

        fos.write(bytes,1,3);

        fos.close();
    }
}
