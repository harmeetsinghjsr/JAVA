package OOPS;
import java.util.Scanner;

public class UserInterfaceproduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product details");
        String input = sc.nextLine();

        ProductUtility util = new ProductUtility();
        
        Product prod = util.extractDetails(input);

        double finalPrice = prod.calculateFinalPrice();

        if (finalPrice == -1) {
            System.out.println("Invalid product details");
        } else {
            System.out.println("Product Details");
            System.out.println("Product Id: " + prod.getProductId());
            System.out.println("Product Name: " + prod.getProductName());
            System.out.println("Original Price: " + prod.getPrice());
            System.out.println("Final Price: " + finalPrice);


        }

        prod.getdetailsall();
        sc.close();
    }
}