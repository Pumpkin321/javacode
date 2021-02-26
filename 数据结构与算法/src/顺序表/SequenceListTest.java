package 顺序表;


/**
 * @Description
 * @Author cyb
 * @Date 2021/1/5 9:07
 */

public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<String> s1 = new SequenceList<String>(10);
        s1.insert("jack");
        s1.insert("tom");
        s1.insert("kim");
        s1.insert(1,"lbj");
        for (String s: s1) {
            System.out.println(s);
        }
        String res = s1.get(1);
        System.out.println("1处的结果："+ res);
        String remove= s1.remove(0);
        System.out.println("删除的元素是："+remove);
        s1.clear();
        System.out.println("清空后个数为：" + s1.length());
    }
}
