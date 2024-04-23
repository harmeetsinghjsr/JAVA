import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        System.out.println(days);
        days.set(1,"Thursday");
        for(String day:days)
        {
            System.out.println(day);
            System.out.println(" ");
        }
        System.out.println();
        days.remove(2);
        System.out.println(days);
    }
}