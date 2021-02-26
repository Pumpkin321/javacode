package com.IO.Buffered;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 14:42
 */
/*
使用字节流缓冲复制视频
 */
public class BufferedCopyAviDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
//        copyavi1();//共耗时:44133毫秒
//        copyavi2();//共耗时:127毫秒
//        copyavi3();//共耗时:484毫秒
        copyavi4();//共耗时:40毫秒
        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时:"+ (endTime-startTime) + "毫秒");
    }

    public static void copyavi1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\IP地址规划.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\copy.mp4");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();

    }

    public static void copyavi2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\IP地址规划.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\copy.mp4");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();

    }

    public static void copyavi3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\IP地址规划.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\copy.mp4"));

        int by;
        while ((by=bis.read())!=-1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }

    public static void copyavi4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\IP地址规划.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\Buffered\\copy.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();

    }
}
