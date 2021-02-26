package 顺序表.algorithm.test;

import java.sql.Statement;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Description
 * @Author cyb
 * @Date 2021/1/5 15:05
 */

public class BracketsMatchTestMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        boolean match = isMatch(str);
        System.out.println(str+"中的括号是否匹配"+match);
    }

    private static boolean isMatch(String str) {
        Stack<String> chars= new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String currChar = str.charAt(i)+"";
            if (currChar.equals("(")){
                chars.push(currChar);
            }else if(currChar.equals(")")){
                String pop = chars.pop();
                if(pop==null){
                    return false;
                }
            }
        }
        if(chars.size()==0){
            return true;
        }else{
            return false;
        }
    }


}
