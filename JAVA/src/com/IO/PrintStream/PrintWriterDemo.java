package com.IO.PrintStream;

import java.awt.print.PrinterGraphics;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 11:51
 */
/*
PrintWriter(String fileName)
使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新。

PrintWriter(Writer out, boolean autoFlush)
创建一个新的PrintWriter。
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter("D:\\找工作\\JAVA\\src\\com\\IO\\PrintStream\\pw.txt");
//        pw.write("hello");
//        pw.flush();

//        pw.println("hello");
//        pw.flush();
        //PrintWriter(Writer out, boolean autoFlush)
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\PrintStream\\pw.txt"),true);
        pw.println("hello");
        pw.close();
    }
}
