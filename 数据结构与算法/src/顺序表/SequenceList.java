package 顺序表;

import java.util.Iterator;

/**
 * @Description
 * @Author cyb
 * @Date 2021/1/5 8:51
 */

public class SequenceList<T> implements Iterable<T> {
    private T[] eles;
    private int N;

    public SequenceList(int capacity) {
        //初始化数据
        this.eles = (T[]) new Object[capacity];
        //初始化长度
        this.N = 0;
    }

    public void clear() {
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int length() {
        return N;
    }

    public T get(int i) {
        return eles[i];
    }

    public void insert(T t) {
        if (N==eles.length){
            resize(2*eles.length);
        }
        eles[N++] = t;
    }

    public void insert(int i, T t) {
        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        eles[i] = t;
        N++;
    }

    public T remove(int i) {
        T current = eles[i];
        for (int index = i; i < N - 1; i++) {
            eles[index] = eles[index + 1];
        }
        N--;
        if (N<eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }

    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public void resize(int newSize) {
        //定义一个临时数据 指向原数组
        T[] temp = eles;
        //创建新数组
        eles = (T[]) new Object[newSize];
        //吧原数组数据拷贝的新数组
        for (int i = 0; i < N; i++) {
            eles[i] = temp[i];
        }

    }


    @Override
    public Iterator<T> iterator() {
        return new SItertor();
    }

    private class SItertor implements Iterator {
        private int cusor;

        public SItertor() {
            this.cusor = 0;
        }

        @Override
        public boolean hasNext() {
            return cusor < N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
