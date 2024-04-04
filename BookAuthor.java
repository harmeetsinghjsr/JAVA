import java.util.Scanner;
import java.util.ArrayList;

class Author{
    String FullName;
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Author's Full Name: ");
        this.FullName = sc.nextLine();
    }
    public void display()
    {
        System.out.println("Author's Full Name: " + FullName);
    }
}
class Book extends Author{
    String BookName;
    public void getInput()
    {
        super.getInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Name: ");
        this.BookName = sc.nextLine();
    }
    public void display(){
        super.display();
        System.out.println("Book Name: " + BookName);
    }
}
public class BookAuthor {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.getInput();
        obj.display();
    }
}
