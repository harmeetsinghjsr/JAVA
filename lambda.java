public class lambda{
    public static void main(String[] args) {
        Runnable printNumbers = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };
        printNumbers.run();
    }
}