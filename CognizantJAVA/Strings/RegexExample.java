import java.util.regex.*;

public class RegexExample{
    public static void main(String[] args) {
        String text = "Order A12 costs 500, Order B7 costs 1200";

        Pattern p = Pattern.compile("\\d+"); // one or more digits
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group()); // prints each number found
        }
    }
}