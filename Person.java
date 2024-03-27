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
    }
}