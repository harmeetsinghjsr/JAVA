import java.util.*;
class Author{
    int FullName;
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Author's Full Name: ");
        FullName = sc.nextInt();
    
    }
    public void display()
    {
        System.out.println("Author's Full Name: " + FullName);
    
    }
}
class Book extends Author{
    int BookName;
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Name: ");
        BookName = sc.nextInt();
    
    }
    public void display2(){
        System.out.println("Book Name: " + BookName);
    }
}
public class BookAuthor {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.getInput();
        obj.display();
        obj.display2();
    }
}
