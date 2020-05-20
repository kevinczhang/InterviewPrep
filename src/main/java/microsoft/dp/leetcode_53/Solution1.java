package microsoft.dp.leetcode_53;

public class Solution1 {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int sumWithEnd = nums[0];
        int max = sumWithEnd;
        for (int i = 1; i < nums.length; i++) {
            sumWithEnd = Math.max(sumWithEnd + nums[i], nums[i]);
            max = Math.max(sumWithEnd, max);
        }
        return max;
    }
}
