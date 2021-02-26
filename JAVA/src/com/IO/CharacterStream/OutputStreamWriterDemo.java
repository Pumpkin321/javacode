package com.IO.CharacterStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 16:12
 */
/*
字符流写数据的5种方式
void write(char[] cbuf, int off, int len)
写入字符数组的一部分。
void write(int c)
写一个字符
void write(String str, int off, int len)
写一个字符串的一部分。
public void write(char[] cbuf)
写入一个字符数组。
public void write(String str)
写一个字符串
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\CSTest.txt"));

        //void write(int c)
        //写一个字符
//        osw.write(97);
//        //flush()
//        //刷新流。
//        osw.flush();

        //public void write(char[] cbuf)
        //写入一个字符数组。
        char[] chs = {'a','b','c','d','e'};
//        osw.write(chs);
        //void write(char[] cbuf, int off, int len)
        //写入字符数组的一部分。
        osw.write(chs,0, chs.length);
        //public void write(String str)
        //写一个字符串
        osw.write("abcdefg");
        //void write(String str, int off, int len)
        //写一个字符串的一部分。
        osw.write("abcdefg",1,3);

        osw.close();
    }
}
