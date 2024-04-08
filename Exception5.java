import java.util.*; 
import java.io.*; 
public class Exception5 {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("abcd.txt");
            String content = "Hello World";
            f.write(content);
            System.out.println("File written successfully");
            f.close(); // Move the f.close() statement inside the try block
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}