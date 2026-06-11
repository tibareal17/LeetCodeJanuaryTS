package leetcode.easy.p0283_move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;

        // [0,1,0,3,12]

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                continue;
            }

            nums[k] = nums[i];
            k++;
        }

        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
