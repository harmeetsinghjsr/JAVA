public class MergeTwoSortedArray {
    public int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] temp = new int[n + m]; // max possible size
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < n && j < m) {
            int val;
            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                val = nums2[j++];
            } else {
                // nums1[i] == nums2[j], take it once and move both
                val = nums1[i];
                i++;
                j++;
            }

            // Add to result only if different from last added
            if (k == 0 || temp[k - 1] != val) {
                temp[k++] = val;
            }
        }

        // Remaining elements in nums1
        while (i < n) {
            int val = nums1[i++];
            if (k == 0 || temp[k - 1] != val) {
                temp[k++] = val;
            }
        }

        // Remaining elements in nums2
        while (j < m) {
            int val = nums2[j++];
            if (k == 0 || temp[k - 1] != val) {
                temp[k++] = val;
            }
        }

        // Shrink to exact size k
        int[] mergedArr = new int[k];
        for(int index=0;index<k;index++){
            mergedArr[index]=temp[index];
        }

        return mergedArr;
    }
    public static void main(String[] args) {
        MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        int[] mergedArr = mergeTwoSortedArray.merge(nums1, nums2);
        for (int num : mergedArr) {
            System.out.print(num + " ");
        }
    }
}