package com.Collecttion.Generic.类型通配符;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 14:46
 */

public class GenericDemo {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("---------------------");
//        List<? extends Number> list4 = new ArrayList<Object>();
        List<?extends Number> list5 = new ArrayList<Number>();
        List<?extends Number> list6 = new ArrayList<Integer>();
        System.out.println("--------------------");
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
//        List<? super Number> list9 = new ArrayList<Integer>();

    }
}
