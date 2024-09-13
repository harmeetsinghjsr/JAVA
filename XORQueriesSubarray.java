//Leetcode problem 1310. XOR Queries of a Subarray
public class XORQueriesSubarray {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[arr.length];
        xor[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            xor[i] = xor[i-1] ^ arr[i];
        }
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0){
                result[i] = xor[right];
            }else{
                result[i] = xor[right] ^ xor[left-1];
            }
        }
        return result;
    }
}