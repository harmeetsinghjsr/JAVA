package OOPS;
public class StudentUtility {

    public Student extractDetails(String details) {

        String[] parts = details.split(":");

        String studentId = parts[0];
        String studentName = parts[1];
        int marks = Integer.parseInt(parts[2]);

        Student s = new Student(studentId, studentName, marks);
        

        return s;
    }
}