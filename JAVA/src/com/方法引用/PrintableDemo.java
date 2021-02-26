package com.方法引用;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 15:18
 */

public class PrintableDemo {
    public static void main(String[] args) {
        //Lambda
        usePrintable(s-> System.out.println(s));

        //方法引用
        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable p){
        p.printString("hello");
    }
}
