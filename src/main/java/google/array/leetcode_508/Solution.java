package google.array.leetcode_508;

public class Solution {
    /*
     * @param nums: A list of integers
     * @return: nothing
     */
    public void wiggleSort(int[] nums) {
        boolean shouldGreater = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (shouldGreater && nums[i] < nums[i + 1]) {
                swap(nums, i, i+1);
            } else if (!shouldGreater && nums[i] > nums[i + 1]) {
                swap(nums, i, i+1);
            }
            shouldGreater = !shouldGreater;
        }
    }

    private void swap(int[] nums, int firstInd, int secondInd) {
        nums[firstInd] += nums[secondInd];
        nums[secondInd] = nums[firstInd] - nums[secondInd];
        nums[firstInd] = nums[firstInd] - nums[secondInd];
    }
}
