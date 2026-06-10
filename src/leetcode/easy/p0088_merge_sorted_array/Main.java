package leetcode.easy.p0088_merge_sorted_array;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2,2,4,5,0,0,0};
        int m = 4;
        int[] nums2 = {1,3,6};
        int n = nums2.length;
        solution.merge(nums1, m, nums2, n);
    }
}
