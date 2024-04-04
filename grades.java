//grades using switch case
//90-100: A gpa:(4.0)
//80-89: B gpa:(3.0)
//70-79: C gpa:(2.0)
//60-69: D gpa:(1.0)
//below 60: F gpa:(0.0)
//input from user
import java.util.*;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        int a = marks/10;
        switch(a)
        {
            case 10:
            case 9:
            System.out.println("A gpa:(4.0)");
            break;
            
            case 8:
            System.out.println("B gpa:(3.0)");
            
            break;
            case 7:
            System.out.println("C gpa:(2.0)");
            break;
            case 6:
            System.out.println("D gpa:(1.0)");
            break;
            default:
            System.out.println("F gpa:(0.0)");
        }
    }
}