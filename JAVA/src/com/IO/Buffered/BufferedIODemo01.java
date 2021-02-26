package com.IO.Buffered;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 14:26
 */
/*
字节缓冲流
BufferedOutputStream
该类实现缓冲输出流。通过设置这样的输出流，应用程序可以向底层输出输出流写入字节，
而不用为写入的每个字节导致底层系统的调用

BufferedInputStream
创建BufferedInputStream将创建一个内部缓冲区数组。当从流中读取或跳过字节时，内部缓冲区
将根据需要从所包含的输入流中重新填充，一次很多字节

字节缓冲流仅仅提供缓冲区，而真正的读写数据还得靠基本的字节流对象进行操作
 */
public class BufferedIODemo01 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //字节缓冲流写入数据
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\bos.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\bos.txt"));
        //一次读取一个字节数据
        int by;
        while((by=bis.read())!=-1){
            System.out.print((char)by);
        }
        bis.close();
        //一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }


    }
}
