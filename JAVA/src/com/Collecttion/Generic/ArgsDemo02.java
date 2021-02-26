package com.Collecttion.Generic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 15:01
 */
/*
可变参数的使用
Arrays工具类： public static <T> List<T> aslist(T...a):返回由指定数组支持的固定大小的列表
返回的集合不能做增删操作 可以修改操作

List接口： public static <E> List<E> of (E... elements):返回包含任意数量元素的不可变列表、
返回的集合不能做增删改操作
Set接口:  public static <E> Set<E> of (E... elements):返回一个包含任意数量元素的不可变集合
不能给重复元素
返回的集合不能做增删操作 没有修改的方法
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
////        public static <T> List<T> aslist(T...a):返回由指定数组支持的固定大小的列表
//        List<String> list= Arrays.asList("jack","jason","jim");
//
////        list.add("javaee");//UnsupportedOperationException
////        list.remove("world");//UnsupportedOperationException
//        list.set(1,"javaee");
//        System.out.println(list);
//        public static <E> List<E> of (E... elements):返回包含任意数量元素的不可变列表
//        List<String> list = List.of("hello", "world", "java","world");
////        list.add("world");//UnsupportedOperationException
////        list.remove("world");//UnsupportedOperationException
////        list.set(1,"javaworld");//UnsupportedOperationException
//        System.out.println(list);
//    }
//        public static <E> Set<E> of (E... elements):返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("hello", "world", "java","world");//IllegalArgumentException
//        Set<String> set = Set.of("hello", "world", "java");
//        set.add("javaee");//UnsupportedOperationException
//        set.remove("world");//UnsupportedOperationException
//        System.out.println(set);
    }

}
