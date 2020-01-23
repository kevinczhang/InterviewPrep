package microsoft.backtrack.leetcode_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> permu = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        getPermutations(nums, used, permu, res);
        return res;
    }

    private void getPermutations(int[] nums, boolean[] used, List<Integer> permu, List<List<Integer>> res){
        if(permu.size() == nums.length){
            res.add(new ArrayList(permu));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                permu.add(nums[i]);
                used[i] = true;
                getPermutations(nums, used, permu, res);
                permu.remove(permu.size() - 1);
                used[i] = false;
                while(i < nums.length-1 && nums[i] == nums[i+1]){
                    i++;
                }
            }
        }
    }
}
