package com.Lambda;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 18:46
 */

public class AddableDemo {
    public static void main(String[] args) {
        useAddable((int x,int y)->{
            return x + y;
        });
    }
    public static void useAddable(Addable a){
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
