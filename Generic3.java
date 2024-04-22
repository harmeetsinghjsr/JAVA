import java.util.*;
class MyData<T>
{   
    T name;
    public MyData(T name)
    {
        this.name=name;
    }
    public T getData()
    {
        return name;
    }
}


public class Generic3 {
    public static void main(String[] args) {
        MyData<Integer> obj1=new MyData<Integer>(10);
        MyData<String> obj2=new MyData<String>("Hello");
        System.out.println(obj1.getData());
        System.out.println(obj2.getData());
    }
}

