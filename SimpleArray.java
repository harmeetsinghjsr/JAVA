public class SimpleArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("All Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        
        System.out.println("\nArray in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }
    }
}
