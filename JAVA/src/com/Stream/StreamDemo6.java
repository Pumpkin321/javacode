package com.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 15:56
 */

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("林青霞");
        array.add("张曼玉");
        array.add("王祖贤");
        array.add("柳岩");

        Stream<String> stringStream = array.stream().filter(s -> s.length() == 3);

        List<String> names = stringStream.collect(Collectors.toList());
        for (String name:names){
            System.out.println(name);
        }

        Set<Integer> set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        Stream<Integer> integerStream = set.stream().filter(age -> age > 25);
        Set<Integer> collect = integerStream.collect(Collectors.toSet());
        for (Integer age : collect){
            System.out.println(age);
        }

        String[] strArray = {"jack,20","tim,35","rose,18"};
        Stream<String> stringStream1 = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 18);
        Map<String, Integer> mapcollect = stringStream1.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        Set<String> keySet = mapcollect.keySet();
        for (String key : keySet){
            Integer value = mapcollect.get(key);
            System.out.println(key+","+value);
        }

    }
}
