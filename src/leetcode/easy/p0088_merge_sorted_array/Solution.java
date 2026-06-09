package leetcode.easy.p0088_merge_sorted_array;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;

        int[] temp = new int[nums1.length];

        int i = 0;
        int j = 0;
        while (k != nums1.length - 1){
            if (nums1[i] <= nums2[j]){
                temp[k] = nums1[i];
                i++;
            }else{
                temp[k] = nums2[j];
                j++;
            }

            k++;
        }

        for (int l = 0; l < nums1.length; l++) {
            nums1[l] = temp[l];
            System.out.println(temp[l]);
        }
    }
}
