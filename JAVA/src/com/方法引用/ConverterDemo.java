package com.方法引用;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 15:29
 */

public class ConverterDemo {
    public static void main(String[] args) {
        useConverter(s ->Integer.parseInt(s));

        useConverter(Integer::parseInt);
    }

    private static void useConverter(Converter c){
        int num = c.convert("6612");
        System.out.println(num);
    }
}
