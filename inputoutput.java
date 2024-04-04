import java.util.Scanner;

public class inputoutput {

    public static void main(String a[]) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        double d = in.nextDouble();
        String s = in.nextLine();        
        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
    }
}