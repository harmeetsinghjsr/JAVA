package OOPS;
public class Student {

    private String studentId;
    private String studentName;
    private int marks;

    public Student(String studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public void setharmeet(String name){
        this.studentName=name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    public String calculateGrade() {

        if (marks < 0 || marks > 100) {
            return null;    
        }

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}