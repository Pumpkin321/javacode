package cominterface;

public interface Inter {
    default void show1(){
        System.out.println("show1开始执行");
        mehtod();
        System.out.println("show1结束执行");
    }
    default void show2(){
        System.out.println("show2开始执行");
        mehtod();
        System.out.println("show2结束执行");
    }

    static void show3(){
        System.out.println("show3开始执行");
        mehtod();
        System.out.println("show3结束执行");
    }
    static void show4(){
        System.out.println("show4开始执行");
        mehtod();
        System.out.println("show4结束执行");
    }
    static void mehtod(){
        System.out.println("起飞咯");
    }
}
