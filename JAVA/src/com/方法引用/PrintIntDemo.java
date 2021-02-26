package com.方法引用;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 15:22
 */

public class PrintIntDemo {
    public static void main(String[] args) {
        useprinInt(i-> System.out.println(i));

        useprinInt(System.out::println);
    }

    private static void useprinInt(printInt p){
        p.printInt(666);
    }
}
