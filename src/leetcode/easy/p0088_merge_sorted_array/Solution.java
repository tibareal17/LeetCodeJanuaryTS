package leetcode.easy.p0088_merge_sorted_array;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1;

        if (nums2.length == 0){
            return;
        }else if (m == 0){
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int j = n - 1;

        // O(n+m)
        for (int i = nums1.length - n - 1; i >= 0 ; i--) {
            while (j >= 0){
                if (nums1[i] >= nums2[j]){
                    nums1[k] = nums1[i];
                    k--;
                    break;
                }

                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
