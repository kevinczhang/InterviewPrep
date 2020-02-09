package microsoft.array.leetcode_128;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Integer> numSet = new HashMap<>();
        //int[] visited = new int[num.length];
        int max = 1, counter = 1;

        for(int i=0; i<num.length; i++)
            numSet.put(num[i], 0);

        for(int i=0; i<num.length; i++){
            if(numSet.get(num[i]) == 1) continue;

            counter = 1;
            int smaller  = num[i] - 1;
            while(numSet.containsKey(smaller)){
                numSet.put(smaller, 1);
                counter++;
                smaller--;
            }

            int larger  = num[i] + 1;
            while(numSet.containsKey(larger)){
                numSet.put(larger, 1);
                counter++;
                larger++;
            }

            max = Math.max(max, counter);
        }
        return max;
    }
}
