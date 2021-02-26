package com.IO.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 11:43
 */
/*
    打印流特点
        只负责输出数据 不负责读取数据
        有自己的特有方法
    字节打印流
        PrintStream (String fileName): 使用指定的文件名创建新的打印流
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream (String fileName): 使用指定的文件名创建新的打印流
        PrintStream ps = new PrintStream("D:\\找工作\\JAVA\\src\\com\\IO\\PrintStream\\ps.txt");

        //写数据
        //字节输出流有的方法
//        ps.write(97);
        //使用特有方法写数据
        ps.print(97);

        //释放资源
        ps.close();




    }
}
