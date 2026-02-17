public class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if i and j are different
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        MoveZerosToEnd mover = new MoveZerosToEnd();
        int[] nums = {0, 20, 0, -20, 0, 20};
        mover.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}