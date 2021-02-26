package com.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 13:22
 */
/*
    字节流写数据的两个小问题
    1字节流写数据如何实现换行
       windows \r\n
        linux \n
        mac \r

    2字节流写数据如何实现追加输入
    FileOutputStream(String name, boolean append)
    创建文件输出流以指定的名称写入文件。
    如果第二个参数为true 则字节将写入文件的末尾而不是开头

 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt");
        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt",true);

        for (int i = 0; i <10 ; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
