package com.File;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/15 17:05
 */
/*
File 类删除功能
delete()
删除由此抽象路径名表示的文件或目录。
 */
public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        //创建Javase.txt文件
        File f1 = new File("D:\\找工作\\JAVA\\src\\com\\File\\Javase.txt");
//        System.out.println(f1.createNewFile());
        //删除javase.txt文件
//        System.out.println(f1.delete());
        //创建目录
        File f2 = new File("D:\\找工作\\JAVA\\src\\com\\File\\Javaweb");
//        System.out.println(f2.mkdir());
        System.out.println(f2.delete());
        //创建目录 并创建文件
        File f3 = new File("D:\\找工作\\JAVA\\src\\com\\File\\javaweb");
        f3.mkdir();
        File f4 = new File("D:\\找工作\\JAVA\\src\\com\\File\\javaweb\\javaweb.txt");
        f4.createNewFile();

        //如果要删除的目录里面有内容 必须先删除该目录下的文件






    }
}
