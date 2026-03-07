package OOPS;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student details");
        String input = sc.nextLine();     

        StudentUtility util = new StudentUtility();

        Student st = util.extractDetails(input);

        st.setharmeet("Harmeet");
        System.out.println(st.getStudentName());

        String grade = st.calculateGrade();

        if (grade == null) {
            System.out.println("Invalid student details");
        } else {
            System.out.println("Student Details");
            System.out.println("Id: " + st.getStudentId());
            System.out.println("Name: " + st.getStudentName());
            System.out.println("Marks: " + st.getMarks());
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}