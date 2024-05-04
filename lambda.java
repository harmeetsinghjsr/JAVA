public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda function to print numbers from 1 to 10
        Runnable printNumbers = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };

        // Running the lambda function
        printNumbers.run();
    }
}
