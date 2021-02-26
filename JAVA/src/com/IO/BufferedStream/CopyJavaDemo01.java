package com.IO.BufferedStream;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 15:32
 */

public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\BufferedStream\\BufferedStreamDemo01.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\BufferedStream\\copy.java"));

        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        bw.close();
        br.close();
    }
}
