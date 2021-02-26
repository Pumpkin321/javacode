package com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 13:53
 */
/*
字节流读数据（一次读一个字节数组数据）
把文件fos.txt中的内容读取出来在控制台输出

read(byte[] b)
从该输入流读取最多 b.length个字节的数据为字节数组。
 */

public class FileInputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //创建字节流输入对象
        FileInputStream fis = new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt");
        //read(byte[] b)
        //从该输入流读取最多 b.length个字节的数据为字节数组。
//        byte[] bys = new byte[5];
////        int len = fis.read(bys);
////        System.out.println(len);
////        //String(byte[] bytes)
////        System.out.println(new String(bys,0,len));
////
////        len = fis.read(bys);
////        System.out.println(len);
////        //String(byte[] bytes)
////        System.out.println(new String(bys,0,len));
////
////        len = fis.read(bys);
////        System.out.println(len);
////        //String(byte[] bytes)
////        //String(byte[] bytes, int offset, int length)
////        //通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 。
////        System.out.println(new String(bys,0,len));

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }

        //释放资源
        fis.close();
    }
}
