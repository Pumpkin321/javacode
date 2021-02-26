package com.IO.BufferedStream;
import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 15:04
 */
/*
BufferedWriter 将文本写入字符输出流 缓冲字符 以提供单个字符 数组和字符串的高效写入，可以指定缓冲区大小
或者可以接受默认大小。默认值足够大 可用于大多数用途

BufferedReader 从字符输入流读取文本 缓冲字符 以提供字符 数组和行的高效读取，可以指定缓冲区大小
或者可以接受默认大小。默认值足够大 可用于大多数用途
BufferedReader(Reader in)
创建使用默认大小的输入缓冲区的缓冲字符输入流。
BufferedWriter(Writer out)
创建使用默认大小的输出缓冲区的缓冲字符输出流。
 */
public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\BufferedStream\\bw.txt"));
        bw.write("hello\r\n");
        bw.write("world\r\n");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\BufferedStream\\bw.txt"));

       //一次读取一个字符
//        int ch;
//        while ((ch=br.read())!=-1){
//            System.out.print((char)ch);
//        }

        char[] chs = new char[1024];
        int len;
        while((len=br.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }
        br.close();
    }
}
