//print armstrong number 
class smthg
{
    public static void main(String[] args) {
        int num = 153;
        int digits = 0;
        int result = 0;
        int originalNum = num;
        // number of digits calculation
        while (originalNum != 0) {
            originalNum /= 10;
            digits++;
        }
        originalNum = num;
        // result contains sum of nth power of its digits
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }
        if (result == num) {
            System.out.println(num + " is an Armstrong number");
        }
    }
}
// Output: 153 is an Armstrong number