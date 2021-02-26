package com.File;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/15 16:30
 */
/*
createNewFile()
当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
如果文件不存在就创建文件 并返回true
如果存在就不创建文件 并返回false

mkdir()
创建由此抽象路径名命名的目录。
如果目录不存在就创建目录 并返回true
如果存在就不创建目录 并返回false

boolean mkdirs()
创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。


 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D://FileTest//java.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("D://FileTest//Javase");
        System.out.println(f2.mkdir());

        File f3 = new File("D://FileTest//JavaWeb//HTML");
        System.out.println(f3.mkdirs());

        File f4 = new File("D://FileTest//Javase.txt");
        System.out.println(f4.createNewFile());
    }
}
