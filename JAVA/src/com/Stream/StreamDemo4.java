package com.Stream;

import java.util.ArrayList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 15:35
 */

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("a12");
        array.add("v23");
        array.add("z2532");
        array.add("g2cv");
        array.add("3d12");

        array.stream().sorted().forEach(System.out::println);
        array.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);




    }
}
