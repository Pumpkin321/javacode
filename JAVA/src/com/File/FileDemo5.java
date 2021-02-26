package com.File;

import java.io.File;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/15 17:29
 */
/*
给定一个路径，通过递归完成遍历该目录下的所有内容，把所有文件的绝对路径输出在控制台

思路：
1根据给定的路径创建一个File对象
2定义一个方法 用于获取给定的目录下所有内容 参数为第一步创建的File对象
3获取给定File目录下所有的文件或者目录的File数组
4遍历File数组 得到每一个File对象
5判断是否为目录
    是 递归调用
    不是 获取绝对路径输出在控制台
6调用方法
 */
public class FileDemo5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\找工作\\JAVA");
        getAllFilePath(f1);
    }

    public static void getAllFilePath(File srcfile){
        File[] filearray = srcfile.listFiles();
        if(filearray!=null){
            for(File file : filearray){
                if(file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
