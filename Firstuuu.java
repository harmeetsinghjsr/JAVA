import java.util.Scanner;
import java.util.*; // Add missing import statement for java.util.*

class Firstuuu
{
    public static void main(String[] b)
    {
        Scanner in=new Scanner(System.in);
        int a;
        a=in.nextInt();
        System.out.println("Hello world");
        System.out.println(a);
        in.close(); // Close the Scanner object to prevent resource leak
    }
}