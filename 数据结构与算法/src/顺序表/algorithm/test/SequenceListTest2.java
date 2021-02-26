package 顺序表.algorithm.test;


import 顺序表.algorithm.linear.SequenceList;

public class SequenceListTest2 {

    public static void main(String[] args) {
        SequenceList<String> sl = new SequenceList<>(3);
        sl.insert("张三");
        sl.insert("李四");
        sl.insert("王五");
        sl.insert("赵六");
    }
}
