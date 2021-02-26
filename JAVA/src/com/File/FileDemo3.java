package com.File;

import java.io.File;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/15 16:40
 */
/*
File类的判断和获取功能
isDirectory()
测试此抽象路径名表示的文件是否为目录。
boolean isFile()
测试此抽象路径名表示的文件是否为普通文件。
exists()
测试此抽象路径名表示的文件或目录是否存在。
getAbsolutePath()
返回此抽象路径名的绝对路径名字符串。
getName()
返回由此抽象路径名表示的文件或目录的名称。
getPath()
将此抽象路径名转换为路径名字符串。
list()
返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
listFiles()
返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
 */
public class FileDemo3 {
    public static void main(String[] args) {
        File f1 = new File("com\\File\\java.txt");
//        isDirectory()
//        测试此抽象路径名表示的文件是否为目录。
//        boolean isFile()
//        测试此抽象路径名表示的文件是否为普通文件。
//        exists()
//        测试此抽象路径名表示的文件或目录是否存在。
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
//        getAbsolutePath()
//        返回此抽象路径名的绝对路径名字符串。
//        getName()
//        返回由此抽象路径名表示的文件或目录的名称。
//        getPath()
//        将此抽象路径名转换为路径名字符串。
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getName());
        System.out.println(f1.getPath());


//        list()
//        返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
//        listFiles()
//        返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File f2 = new File("D:\\找工作\\JAVA");
        String[] StrArray = f2.list();
        for (String s : StrArray){
            System.out.println(s);
        }

        File[] filesArray = f2.listFiles();
        for (File file : filesArray){
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }

    }
}
