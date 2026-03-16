public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        setMarks(marks);
    }

    public void setMarks(int marks) {
        this.marks = Validator.changeMarks(marks);
    }

    public void display() {
        System.out.print("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }
}