import java.lang.System;

class MyData<T> {
    T a;
    void add(T a1) {
        a = a1;
    }
    void display(T x) {
        a = x;
        System.out.println(a);
    }
    
}

public class Generic1 {

    public static void main(String[] args) {
        MyData<Integer> obj = new MyData<>();
        obj.add(2);
        System.out.println(obj.a);

    }
}
