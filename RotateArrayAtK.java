public class RotateArrayAtK {
    public void rotateArrayAtK(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int temp[]=new int[n];
        for(int i=0; i < k; i++) {
            temp[i]=nums[i];
        }
        for(int i=k; i<n; i++){
            nums[i-k]=nums[i];
        }
        for(int i=n-k;i<n;i++){
            nums[i]=temp[i-k];
        }
    }
    public static void main(String[] args) {
        RotateArrayAtK rotate = new RotateArrayAtK();
        int[] nums = {10,8,2,5,11,13};
        int k = 4;
        rotate.rotateArrayAtK(nums, k);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
