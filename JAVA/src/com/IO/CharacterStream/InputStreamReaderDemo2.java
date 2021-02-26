package com.IO.CharacterStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 16:25
 */
/*
字符流读取数据的两种方式
int read()
读一个字符
int read(char[] cbuf, int offset, int length)
将字符读入数组的一部分。
 */
public class InputStreamReaderDemo2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\isr.txt"));
        //int read()
        //读一个字符
//        int ch;
//        while ((ch=isr.read())!=-1){
//            System.out.print((char)ch);
//        }
        //int read(char[] cbuf, int offset, int length)
        //将字符读入数组的一部分。
        char[] chs = new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        isr.close();
    }
}
