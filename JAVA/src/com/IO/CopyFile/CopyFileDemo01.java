package com.IO.CopyFile;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 17:11
 */
/*
把D：//FileTest下的文件夹复制到模块目录下

创建源目录File对象，路径是D：//FileTest
获取File名称（FileTest）
创建目的地目录File对象
判断你目的地目录对应的File是否存在 如果不存在就创建
获取数据源目录下所有文件的File数组
遍历File数组 得到每一个File对象 该File对象 其实就是源数据文件
获取源数据文件File对象的名称
创建目的地文件File对象 路径是目的地目录+名称
复制文件（不只是文本 所以采用字节流复制文件）
 */
public class CopyFileDemo01 {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("D:\\FileTest");

        String srcFolderName=srcFolder.getName();
        File destFolder = new File("D:\\找工作\\JAVA\\src\\com\\IO\\CopyFile",srcFolderName);
        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        File[] files = srcFolder.listFiles();
        for (File srcFile:files){
            String srcFileName = srcFile.getName();
            File destFile = new File(destFolder,srcFileName);
            copy(srcFile,destFile);
        }
    }

    private static void copy(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }

}
