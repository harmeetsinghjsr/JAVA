class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Instanceof {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Using instanceof to check the type of objects
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;
            dog.bark();
        }

        if (animal2 instanceof Cat) {
            Cat cat = (Cat) animal2;
            cat.meow();
        }

        // Checking for superclass
        if (animal1 instanceof Animal) {
            System.out.println("animal1 is an instance of Animal");
        }

        // Checking for non-related types
        if (!(animal1 instanceof Cat)) {
            System.out.println("animal1 is not an instance of Cat");
        }
    }
}
