
public class SecondLargest {
    int secondLargestElement(int nums[])
    {
        int second=-1;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                
                max=nums[i];
            }
            else if(nums[i]>second && nums[i]<max)
            {
                second=nums[i];
            }
        }
        return second;
    }
    
    // public int secondLargestElement(int[] nums) {
    //     Arrays.sort(nums);
    //     int second=-1;
    //     int n=nums.length;
    //     int first = nums[n-1];
        
    //     for(int i=n-1;i>0;i--)
    //     {
    //         if(nums[i]<first){
    //         second=nums[i];
    //         break;
    //         }
    //     }
    //     return second;
    // }
    public static void main(String[] args) {
        SecondLargest sl = new SecondLargest();
        int[] nums = {12, 35, 1, 10, 36, 1};
        System.out.println("Second largest element is: " + sl.secondLargestElement(nums));
    }
}