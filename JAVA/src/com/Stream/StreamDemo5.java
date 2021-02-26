package com.Stream;

import java.util.ArrayList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 15:39
 */

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("10");
        array.add("20");
        array.add("30");
        array.add("40");
        array.add("50");

        array.stream().map(Integer::parseInt).forEach(System.out::println);
        array.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        int result = array.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);
    }
}
