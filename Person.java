public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //write main method
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person("John", 30);
        Person person4 = new Person("John", 30, "123 Main St");

        System.out.println("Person 1: " + person1.name + ", " + person1.age + ", " + person1.address);
        System.out.println("Person 2: " + person2.name + ", " + person2.age + ", " + person2.address);
        System.out.println("Person 3: " + person3.name + ", " + person3.age + ", " + person3.address);
        System.out.println("Person 4: " + person4.name + ", " + person4.age + ", " + person4.address);
    }
}