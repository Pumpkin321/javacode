package cominterface;

public interface Myinterface {
    void show1();
    default void show2(){
        System.out.println("Inter中的默认方法执行了");
    }
    static void show3(){
        System.out.println("Inter中的静态方法执行了");
    }

}
