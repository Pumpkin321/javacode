package com.IO.CharacterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 17:33
 */
/*
FileReader
用于读取文件的便捷类
FileReader(String fileName)

FileWriter
用于写入字符文件的便捷类
FileWriter(String fileName)
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\FileInputStreamDemo.java");
        FileWriter fw = new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\CharacterStream\\copy.java");

//        int ch;
//        while ((ch=fr.read())!=-1){
//            fw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }
        fw.close();
    }
}
