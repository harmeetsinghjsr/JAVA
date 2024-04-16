import java.lang.System;

class MyData<T> {
    T a;
    void add(T a1) {
        a = a1;

    }
    void display(int a) {
        T a=a;
        System.out.println(a);
    }
    
}
public class Genric {

    public static void main(String[] args) {
        MyData<Integer> obj = new MyData<>();
        obj.add(2);
        System.out.println(obj.a);

    }
}
