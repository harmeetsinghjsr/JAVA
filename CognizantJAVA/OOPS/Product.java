package OOPS;
public class Product {

    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void  getdetailsall(){
        System.out.println("Product Details");
        System.out.println("Product Id: " + productId); 
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
            
    }
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double calculateFinalPrice() {

        if (price < 0) {
            return -1;
        }

        double discountPercent = 0;

        if (price >= 1000) {
            discountPercent = 20;
        } else if (price >= 500) { 
            discountPercent = 10;
        } else {
            discountPercent = 0;
        }

        double discountAmount = price * discountPercent / 100.0;
        double finalPrice = price - discountAmount;

        return finalPrice;
    }
}