package com.Stream;

import java.util.ArrayList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 15:13
 */

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("张三");
        array.add("李四");
        array.add("王五");
        array.add("张三丰");
        array.add("张无忌");

        array.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);
    }
}
