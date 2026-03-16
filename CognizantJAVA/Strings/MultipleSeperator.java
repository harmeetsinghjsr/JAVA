import java.util.*;

public class MultipleSeperator {
    public static void main(String[] args) {
        String line = "a, b; c   d";
        String[] parts = line.split("[,;\\s]+"); // comma OR semicolon OR whitespace (1+)

        System.out.println(Arrays.toString(parts)); // [a, b, c, d]
    }
}