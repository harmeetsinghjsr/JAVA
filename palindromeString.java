import java.util.*;
class palindromeString{
    public static String swap(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            s.append((char) ('0' + n % 10));
            n /= 10;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }
        return s.toString();
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5789;
        String reversed = swap(n);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is Palindrome: " + isPalindrome(reversed));
    }
}