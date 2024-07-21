class palindrometill100 {
    public static void main(String[] args) {
        int rev = 0;
        for (int i = 0; i < 100; i++) {
            int n = i; // Save the original value of i
            rev = 0;
            int x = i; // Separate variable for loop iteration
            while (x != 0) {
                rev = rev * 10 + (x % 10);
                x = x / 10;
            }
            if (rev == n) {
                System.out.println(n);
            }
        }
    }
}