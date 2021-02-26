package cominterface;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 14:46
 */
/*
默认方法不是抽象方法 不强制重写。但是可以被重写 重写的时候去掉default关键字
public 可以省略 default不可以省略

接口中静态方法只能通过接口名调用 不能通过实现类或对象名字调用
public 可以省略 static不可以省略

私有方法
默认方法可以调用私有的静态方法和非静态方法
静态方法只能调用私有的静态方法

 */
public class interfaceDemo {
    public static void main(String[] args) {
//        Myinterface mi = new MyinterfaceImpl();
//        mi.show1();
//        mi.show2();
//        Myinterface.show3();
        Inter i = new InterImol();
        i.show1();
        i.show2();
        Inter.show3();
        Inter.show4();
    }
}
