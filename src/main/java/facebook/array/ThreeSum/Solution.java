package facebook.array.ThreeSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
        	// remove duplicate for mid element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
            while (lo < hi) {
                if (nums[lo] + nums[hi] < sum) {
                    lo++;
                    continue;
                } else if (nums[lo] + nums[hi] > sum) {
                    hi--;
                    continue;
                }

                res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                // Remove duplicate for lo element
                while (lo < hi && nums[lo] == nums[lo + 1]) {
                    lo++;
                }
                // Remove duplicate for hi element
                while (lo < hi && nums[hi] == nums[hi - 1]) {
                    hi--;
                }
                lo++;
                hi--;
            }
        }
        return res;
    }
}
