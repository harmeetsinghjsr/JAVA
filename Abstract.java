import java.util.*;
abstract class A{
    public void A()
    {
        System.out.println("This is a constructor of abstract class A");
    }
    public void Hello()
    {
        System.out.println("Hello guyz!");
    }
    abstract void namaste();
    abstract void hola();
    abstract void bonjour();
    abstract void ciao();
}
class B extends A{
    public B()
    {
        System.out.println("This is a constructor of class B");
    }
    @Override
    void namaste()
    {
        System.out.println("Namaste guyz!");
    }
    @Override
    void hola()
    {
        System.out.println("Hola guyz!");
    }
    @Override
    void bonjour()
    {
        System.out.println("Bonjour guyz!");
    }
    @Override
    void ciao()
    {
        System.out.println("Ciao guyz!");
    }
}
abstract class C extends A{
    public void RamRam()
    {
        System.out.println("Ram Ram bhaiyo!");
    }
}
public class Abstract {
    public static void main(String[] args) {
        B obj = new B();
        obj.namaste();
        obj.hola();
        obj.bonjour();
        obj.ciao();
        obj.Hello();
        C obj1 = new C(){
            @Override
            void namaste()
            {
                System.out.println("Namaste bhaiyo!");
            }
            @Override
            void hola()
            {
                System.out.println("Hola bhaiyo!");
            }
            @Override
            void bonjour()
            {
                System.out.println("Bonjour bhaiyo!");
            }
            @Override
            void ciao()
            {
                System.out.println("Ciao bhaiyo!");
            }
        };
        obj1.namaste();
        obj1.hola();
        obj1.bonjour();
        obj1.ciao();
        obj1.Hello();
        obj1.RamRam();
    }
    
}
