package leetcode.easy.p0026_remove_duplicates_from_sorted_array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int currentNum = nums[0];
        int k = 1;


        // Input: nums = [0,0,1,1,1,2,2,3,3,4]

        for (int i = 1; i < nums.length; i++) {
            if (currentNum == nums[i]) {
                continue;
            }

            currentNum = nums[i];
            nums[k] = nums[i];
            k++;
        }

        return k;
    }
}
