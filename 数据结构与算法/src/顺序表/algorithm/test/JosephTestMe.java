package 顺序表.algorithm.test;

/**
 * @Description
 * @Author cyb
 * @Date 2021/1/5 14:26
 */

public class JosephTestMe {
    public static void main(String[] args) {
        Node<Integer> first = null;
        Node<Integer> pre = null;
        for (int i = 1;i<=41;i++){
            if(i==1){
                first = new Node<>(i,null);
                pre = first;
                continue;
            }
            Node<Integer> newNode = new Node<>(i,null);
            pre.next=newNode;
            pre=newNode;
            if (i==41){
                pre.next=first;
            }
        }
        int count =0;

        Node<Integer> now = first;
        Node<Integer> preNode = null;

        while (now!=now.next){
            count++;
            if(count==3){
                preNode.next=now.next;
                System.out.print(now.item+",");
                count=0;
                now=now.next;
            }else{
                preNode=now;
                now=now.next;
            }
        }
        System.out.print(now.item);
    }

    private static class Node<T>{
        T item;
        Node next;
        public Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }
}
