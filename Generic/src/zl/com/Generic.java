package zl.com;

import java.util.ArrayList;
import java.util.List;

public class Generic<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <E> E getE(E e) {
        return null;
    }

    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        generic.setT(new String("aa"));
        System.out.println(generic.getT());

        List<? extends Number> list = null;
        List<Integer> list1 = null;
        List<Object> list2 = null;

        List<? super Number> list3;

        list = list1;

        list3 = list2;

    }
}
