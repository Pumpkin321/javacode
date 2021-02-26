package com.IO.CharacterStream;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 16:37
 */
/*
复制Java文件
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\FileInputStreamDemo.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\Copy.java"));

//        int ch;
//        while ((ch=isr.read())!=-1){
//            osw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }

        osw.close();
        isr.close();
    }
}
