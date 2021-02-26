package com.IO.BufferedStream;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 15:41
 */

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\BufferedStream\\BufferedStreamDemo02.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\BufferedStream\\copy.java"));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
