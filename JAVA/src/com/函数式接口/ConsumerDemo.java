package com.函数式接口;

import java.util.function.Consumer;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 16:02
 */

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("林青霞",s -> System.out.println(s));

        operatorString("林青霞",s -> {
            System.out.println(new StringBuilder(s).reverse().toString());
        });

        operatorString("jack",s -> System.out.println(s),s -> System.out.println(new StringBuilder(s).reverse().toString()));
    }
    private static void operatorString(String name,Consumer<String > con1,Consumer<String > con2){
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);
    }

    private static void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
}
