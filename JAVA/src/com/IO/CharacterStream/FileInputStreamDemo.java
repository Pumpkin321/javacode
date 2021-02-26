package com.IO.CharacterStream;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/16 15:14
 */
/*
    字符流= 字节流+编码表

    一个汉字存储
    如果是GBK 占用2个字节
    如果是UTF-8 占用你3个字节
    汉字在存储时 无论选择哪种编码存储 第一字节都是负数

    编码表
    按照某种规则，将字符存储到计算机中，称为编码。
    将存储在计算机中的二进制数按照某种规则解析出来 称为解码

 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";

//        byte[] bys = s.getBytes();
        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));

        String ss= new String(bys,"GBK");
        System.out.println(ss);
    }
}
