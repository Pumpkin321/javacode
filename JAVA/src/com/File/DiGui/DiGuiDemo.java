package com.File.DiGui;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/15 17:15
 */

public class DiGuiDemo {
    public static void main(String[] args) {
        System.out.println(fib(20));
        System.out.println(jc(5));
    }

    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static int jc(int n ){
        if(n==1){
            return  1;
        }
        return n*jc(n-1);
    }
}
