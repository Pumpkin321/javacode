package com.IO.PrintStream;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 11:57
 */

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\PrintStream\\PrintWriterDemo.java"));
////        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\PrintStream\\copy.java"));
////        String line;
////        while ((line = br.readLine())!=null){
////            bw.write(line);
////            bw.newLine();
////            bw.flush();
////        }
////        bw.close();
////        br.close();
        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\PrintStream\\PrintWriterDemo.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\\\找工作\\\\JAVA\\\\src\\\\com\\\\IO\\\\PrintStream\\\\copy.java",true));
        String line;
        while ((line = br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
