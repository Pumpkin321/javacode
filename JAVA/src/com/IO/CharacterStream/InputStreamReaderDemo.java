package com.IO.CharacterStream;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 15:56
 */
/*
    InputStreamReaderDemo2 是从字节流到字符流的桥梁
    读取字节，并使用指定的编码将其解码为字符
    它使用的字符集可以有名称指定，也可以明确指定，或者可以接受平台的默认字符集

    InputStreamReaderDemo2 是从字符流到字节流的桥梁
    是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集

字符流读取数据的两种方式
int read()
读一个字符
int read(char[] cbuf, int offset, int length)
将字符读入数组的一部分。

 */

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter(OutputStream out)
        //创建一个使用默认字符编码的OutputStreamWriter。
        //OutputStreamWriter(OutputStream out, Charset cs)
        //创建一个使用给定字符集的OutputStreamWriter。
//        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\CSTest.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\CSTest.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\CSTest.txt"),"GBK");
        osw.write("中国");
        osw.close();

        //InputStreamReaderDemo2(InputStream in)
        //创建一个使用默认字符集的InputStreamReader。
        //InputStreamReaderDemo2(InputStream in, Charset cs)
        //创建一个使用给定字符集的InputStreamReader。
//        InputStreamReaderDemo2 isr = new InputStreamReaderDemo2(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\CSTest.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\CSTest.txt"),"GBK");
        //一次读取一个字符数据
        //int read()
        //读一个字符
        int ch;
        while((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }
        //一次读取一个字符数组数据
        //int read(char[] cbuf, int offset, int length)
        //将字符读入数组的一部分。
    }
}
