import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            boolean printedAlready = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == ch) {
                    printedAlready = true;
                    break;
                }
            }
            if (printedAlready) continue;

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) count++;
            }

            System.out.println(ch + " = " + count);
        }

        sc.close();
    }
}