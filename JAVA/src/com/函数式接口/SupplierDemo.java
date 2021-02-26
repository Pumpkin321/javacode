package com.函数式接口;

import java.util.function.Supplier;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 15:56
 */

public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> "jack");
        System.out.println(s);

        Integer integer = getInteger(() -> 369);
        System.out.println(integer);

        int[] arr= {12,30,5,23,1};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    private static String getString(Supplier<String> sup){
        return sup.get();
    }

    private static Integer getMax(Supplier<Integer> sup){
        return sup.get();
    }

}
