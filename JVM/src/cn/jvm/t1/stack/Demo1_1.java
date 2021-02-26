package cn.jvm.t1.stack;

/**
 * @Description
 * @Author cyb
 * @Date 2021/1/12 17:03
 */

public class Demo1_1 {
    public static void main(String[] args) throws InterruptedException {
        method1();
    }
    private static void method1() {
        method2(1, 2);
    }
    private static int method2(int a, int b) {
        int c =  a + b;
        return c;
    }
}
