package com.IO.StandardInOutStream;

import java.io.PrintStream;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 11:37
 */
/*
public static final PrintStream out
“标准”输出流。 此流已经打开并准备好接受输出数据。
通常，此流对应于显示输出或由主机环境或用户指定的另一个输出目标。
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        //public static final PrintStream out
        PrintStream ps = System.out;

        ps.print(100);
        ps.print("hello");

        System.out.println(200);
        System.out.println("world");
    }
}
