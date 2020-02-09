package microsoft.backtrack.leetcode_46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        getPermutations(nums, used, permutation, res);
        return res;
    }

    private void getPermutations(int[] nums, boolean[] used, List<Integer> permutation, List<List<Integer>> res) {
        if (permutation.size() == nums.length) {
            res.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                permutation.add(nums[i]);
                used[i] = true;
                getPermutations(nums, used, permutation, res);
                permutation.remove(permutation.size() - 1);
                used[i] = false;
            }
        }
    }
}
