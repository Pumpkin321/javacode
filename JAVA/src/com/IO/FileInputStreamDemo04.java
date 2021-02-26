package com.IO;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 14:08
 */
/*
复制图片
 */
public class FileInputStreamDemo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\c3.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\copy.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();

    }
}
