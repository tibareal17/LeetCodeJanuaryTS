package leetcode.easy.p0977_squares_of_a_sorted_array;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        // [-4,-1,0,3,10]

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[left] * nums[left] < nums[right] * nums[right]){
                res[i] = nums[right] * nums[right];
                right--;
            }else {
                res[i] = nums[left] * nums[left];
                left++;
            }
        }

        return res;
    }
}
