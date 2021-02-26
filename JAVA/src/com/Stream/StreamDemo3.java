package com.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 15:28
 */

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("张三");
        array.add("李四");
        array.add("王五");
        array.add("张三丰");
        array.add("张无忌");
//        array.stream().limit(3).forEach(System.out::println);
//        array.stream().skip(3).forEach(System.out::println);
//        array.stream().skip(2).limit(2).forEach(System.out::println);

        Stream<String> s1 = array.stream().limit(4);
        Stream<String> s2 = array.stream().skip(1);
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
    }
}
