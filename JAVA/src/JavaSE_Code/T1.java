package JavaSE_Code;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description
 * @Author cyb
 * @Date 2020/9/1 17:07
 */

public class T1 {
    public static void main(String[] args) {
//        ArrayList<String> array = new ArrayList<String>();
//        array.add("hello");
//        array.add("you");
//        System.out.println("array"+array);
//
//        for (int i = 0; i <array.size() ; i++) {
//            String s = array.get(i);
//            System.out.println(s);
//        }
//        String s ="100";
//        Integer i = Integer.valueOf(s);
//        int x = i.intValue();
//        System.out.println(x);
        String s = "20 30 40 50 60 ";
        String[] strarr = s.split(" ");
        int[] arr = new int[strarr.length];
        for (int i = 0; i < strarr.length; i++) {
            arr[i] = Integer.parseInt(strarr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}