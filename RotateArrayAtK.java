public class RotateArrayAtK {
    public void rotateArrayAtK(int[] nums, int k) {
        int n = nums.length;
        k=k%n+1;
        int temp[]=new int[n];
        for(int i=0; i < k; i++) {
            temp[i]=nums[i];
        }
        for(int i=k; i<n; i++){
            nums[i-k]=nums[i];
        }
        for(int i=n-k;i<n;i++){
            nums[i]=temp[i-(n-k)];
        }
    }
    public static void main(String[] args) {
        RotateArrayAtK rotate = new RotateArrayAtK();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate.rotateArrayAtK(nums, k);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
