import java.util.*;
class A{
    void printA(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }
    void Z(){
        System.out.println("Z");
    }
}
class B extends A{
    void printB(){
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");
    }
}
class inheritance extends B{
    public static void main(String ar[]){
        inheritance obj = new inheritance();
        obj.Z();
        obj.printA();  
        obj.printB();
    }
}