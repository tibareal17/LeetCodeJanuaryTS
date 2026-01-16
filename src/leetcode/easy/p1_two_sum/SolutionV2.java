package leetcode.easy.p1_two_sum;

import java.util.HashMap;
import java.util.Map;

// EXAMPLE
// nums[] = {2,7,11,15} && target = 9
//
public class SolutionV2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
