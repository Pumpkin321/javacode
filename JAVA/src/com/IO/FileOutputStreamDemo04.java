package com.IO;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 13:31
 */
/*
    字节流写数据加入异常处理
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
