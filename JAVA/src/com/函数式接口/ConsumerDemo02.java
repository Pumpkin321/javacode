package com.函数式接口;

import java.util.function.Consumer;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 16:14
 */

public class ConsumerDemo02 {
    public static void main(String[] args) {
        String[] strArray = {"jack,20","tim,15","rose,30"};
        printInfo(strArray,str -> System.out.print("姓名"+str.split(",")[0]),str-> System.out.println(",年龄"+Integer.parseInt(str.split(",")[1])));
    }

    private static void printInfo(String[] strArray, Consumer<String> con1,Consumer<String> con2){
        for (String str :strArray){
            con1.andThen(con2).accept(str);
        }
    }
}
