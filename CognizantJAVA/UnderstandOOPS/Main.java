public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Harmeet", 95);
        s1.display(); 
        System.out.println();

        InternationalStudent s2 = new InternationalStudent(2, "Alice", 150, "Canada");
        s2.display(); 
    }
}