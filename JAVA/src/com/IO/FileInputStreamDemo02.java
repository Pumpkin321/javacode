package com.IO;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 13:49
 */
/*
    复制文本文件

 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt");
        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\copy.txt");

        int by ;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
