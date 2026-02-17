class A {
    // Constructor of A
    A() {
        System.out.println("A constructor called");
    }

    void show() {
        System.out.println("This is class A");
    }
}

class B extends A {
    // Constructor of B
    B() {
        System.out.println("B constructor called");
    }

    void show() {
        System.out.println("This is class B");
    }
}

class C extends B {
    // Constructor of C
    C() {
        System.out.println("C constructor called");
    }

    void show() {
        System.out.println("This is class C");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();   // calls A() constructor
        B b = new B();   // calls A() then B()
        C c = new C();   // calls A() then B() then C()

        a.show();        // A's show()
        b.show();        // B's show()
        c.show();        // C's show()

        
    }
}