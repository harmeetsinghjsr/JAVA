public class Main {
    public static void main(String[] args) {
        
        // 1. Array of student strings to process
        String[] students = {
            "A:12345:95",    // Valid (Grade A)
            "B:67890:82",    // Valid (Grade B)
            "C:11111:65",    // Valid (Grade D)
            "X:999:200",     // Invalid (Wrong ID length and Marks)
            "D:55555:45"     // Valid (Grade F)
        };

        System.out.println("--- Student Grade Report ---");

        for (String data : students) {
            try {
                // We call the static method directly
                System.out.print("Input [" + data + "] -> ");
                Student.Grade(data); 
                
            } catch (InvalidStudentDetails e) {
                // This only runs if the 'throw' keyword was triggered
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        
        System.out.println("--- Processing Complete ---");
    }
}