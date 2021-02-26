package com.IO.CopyFile;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 17:27
 */
/*
复制多级文件夹

 */
public class CopyFileDemo02 {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\FileTest");
        File destFile = new File("D:\\找工作\\JAVA\\src\\com\\IO\\CopyFile");
        copyFolder(srcFile,destFile);
    }
//复制文件夹
    private static void copyFolder(File srcFile,File destFile) throws IOException {
        if(srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName);
            if (!newFolder.exists()){
                newFolder.mkdir();
            }
            File[] listFiles = srcFile.listFiles();
            for (File file:listFiles){
                copyFolder(file,newFolder);
            }
        }else {
            File newFile = new File(destFile,srcFile.getName());
            CopyFile(srcFile,newFile);
        }
    }
//复制文件
    private static void CopyFile(File srcFile, File destFile) throws IOException {
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


