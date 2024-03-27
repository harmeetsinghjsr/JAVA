public class diagonal {
    //sum of left diagonal elements
    public int sumLeftDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
    
    //Sum of right diagonal elements 
    public int sumRightDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - i - 1];
        }
        return sum;
    }
public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        diagonal d = new diagonal();
        System.out.println("Sum of left diagonal elements: " + d.sumLeftDiagonal(arr));
        System.out.println("Sum of right diagonal elements: " + d.sumRightDiagonal(arr));
}
}