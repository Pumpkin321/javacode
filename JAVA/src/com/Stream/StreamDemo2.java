package com.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 15:18
 */
/*
Stream流的常见生成方式
1Collection体系的集合可以使用默认方法stream()生成流
default Stream<E> stream()

2Map体系的集合间接的生成流
3数组可以通过Stream的接口静态方法 of(T...values)


 */
public class StreamDemo2 {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接的生成流
        Map<String,Integer> map = new HashMap<String, Integer>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        String[] arr = {"hello","world","java"};
        Stream<String> stringStream = Stream.of(arr);
        Stream<String> stringStream1 = Stream.of("hello", "world");

    }
}
