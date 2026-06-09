package leetcode.easy.p0027_remove_element;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                continue;
            }

            nums[k] = nums[i];
            k++;
        }

        return k;
    }
}
