package OOPS;
public class ProductUtility {

    public Product extractDetails(String details) {

        String[] parts = details.split(":");

        String productId = parts[0];
        String productName = parts[1];
        double price = Double.parseDouble(parts[2]);

        Product p = new Product(productId, productName, price);

        return p;
    }
}