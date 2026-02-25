import java.util.*;
class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n= nums.length+1;
        boolean flag=false;
        for(int i=1;i<=n;i++){
            flag=false;
            for(int j=0;j<n-1;j++){
                flag=false;
                if(nums[j]==i){
                    flag =true;break;
                }
            }
            if(!flag)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(missingNumber(nums));
    }
}