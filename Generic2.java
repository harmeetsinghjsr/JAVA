class MyData<T>{
    T a;
    public void setValues(T a1) {
        a = a1;
    }
    public T getValues() {
        return a;
    }
    public <A> void NewData(A ab) {
        System.out.println(ab);
    }
}



public class Generic2 {
    public static void main(String[] args) {
        MyData<Integer> obj = new MyData<>();
        obj.setValues(456);
        System.out.println(obj.getValues());
        obj.NewData("Hello");
    }
}
