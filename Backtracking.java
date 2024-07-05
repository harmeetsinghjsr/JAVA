public class Backtracking {
    public static void PrintPermutation(String str, String perm, int index) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            PrintPermutation(newStr, perm + current, index + 1);
        }
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        PrintPermutation(str, "", 0);
    }
}