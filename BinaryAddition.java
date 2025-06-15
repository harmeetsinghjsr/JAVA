public class BinaryAddition {

    public static String addBinaryStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i>=0 || j>=0 || carry>0) {
            int sum = 0;
            if(carry==1)
            sum++;

            if (i >= 0 && a.charAt(i)=='1') sum++;
            if (j >= 0 && b.charAt(j)=='1') sum++;

            if (sum == 0) {
                result.append('0');
                carry = 0;
            } else if (sum == 1) {
                result.append('1');
                carry = 0;
            } else if (sum == 2) {
                result.append('0');
                carry = 1;
            } else if (sum == 3) {
                result.append('1');
                carry = 1;
            }
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1101";
        String result = addBinaryStrings(a, b);
        System.out.println("Sum: " + result);
    }
}