package com.IO.CopyFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 11:04
 */
/*
复制文件异常处理
 */
//public class CopyFileException {
//    public static void main(String[] args) {
//
//    }
//    //JDK9改进方案
//    private static void method4() throws IOException {
//        FileReader fr = new FileReader("fr.txt");
//        FileWriter fw = new FileWriter("fw.txt");
//        try (fr;fw) {
//            char[] chs = new char[1024];
//            int len;
//            while ((len = fr.read(chs)) != -1) {
//                fw.write(chs, 0, len);
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }

//    //JDK7改进方案
//    private static void method3() {
//        try (FileReader fr = new FileReader("fr.txt");
//             FileWriter fw = new FileWriter("fw.txt");) {
//            char[] chs = new char[1024];
//            int len;
//            while ((len = fr.read(chs)) != -1) {
//                fw.write(chs, 0, len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }




    //try...catch...finally
//    public static void method(){
//        FileReader fr =null;
//        FileWriter fw = null;
//        try {
//            fr = new FileReader("fr.txt");
//            fw = new FileWriter("fw.txt");
//            char[] chs = new char[1024];
//            int len;
//            while((len=fr.read(chs))!=-1){
//                fw.write(chs,0,len);
//            }
//        }catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(fw!=null){
//                try {
//                    fw.close();
//                }catch (IOException e ){
//                    e.printStackTrace();
//                }
//            }
//            if (fr!=null){
//                try {
//                    fr.close();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//}
