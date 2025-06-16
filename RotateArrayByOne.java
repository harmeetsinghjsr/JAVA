public class RotateArrayByOne {
    public void rotateArrayByOne(int[] nums) {
        int f = nums[0];
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[n - 1] = f;
    }
    public static void main(String[] args) {
        RotateArrayByOne rotate = new RotateArrayByOne();
        int[] nums = {1, 2, 3, 4, 5};
        rotate.rotateArrayByOne(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
