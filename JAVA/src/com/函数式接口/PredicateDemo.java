package com.函数式接口;

import java.util.function.Predicate;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 16:20
 */

public class PredicateDemo {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", s -> s.length() > 8);
        System.out.println(b1);
    }

    private static boolean checkString(String s, Predicate<String> pre){
//        return pre.test(s);
        return pre.negate().test(s);
    }
}
