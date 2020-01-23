package microsoft.array.leetcode_665;

public class Solution {
    /**
     * @param nums: an array
     * @return: if it could become non-decreasing by modifying at most 1 element
     */
    public boolean checkPossibility(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++)
            if (nums[i] < nums[i - 1]) {
                count++;
                if (i >= 2 && nums[i] < nums[i - 2])
                    nums[i] = nums[i - 1];
                else
                    nums[i - 1] = nums[i];
            }
        return count<=1;
    }
}
