package microsoft.backtrack.leetcode_77;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        findCombinations(n, k, 1, comb, res);
        return res;
    }

    private void findCombinations(int n, int k, int start, List<Integer> comb, List<List<Integer>> res){
        if(comb.size() == k){
            res.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start; i <= n; i++){
            comb.add(i);
            findCombinations(n, k, i + 1, comb, res);
            comb.remove(comb.size() - 1);
        }
    }
}
