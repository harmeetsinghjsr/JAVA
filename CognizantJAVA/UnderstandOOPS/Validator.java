public class Validator {
    public static int changeMarks(int marks) {
        if (marks < 0) return 0;
        if (marks > 100) return 100;
        return marks;
    }
}