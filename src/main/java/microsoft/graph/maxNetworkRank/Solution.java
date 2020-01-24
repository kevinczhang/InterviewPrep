package microsoft.graph.maxNetworkRank;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static int countEdges(int[] arr1, int[] arr2, int total) {
        // TODO Auto-generated method stub
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr1.length;i++) {
            map.putIfAbsent(arr1[i], 0);
            map.put(arr1[i],map.get(arr1[i])+1);
            map.putIfAbsent(arr2[i], 0);
            map.put(arr2[i],map.get(arr2[i])+1);

        }
        int max=0;
        for(int i=0;i<arr1.length;i++) {
            max=Math.max(map.get(arr1[i])+map.get(arr2[i])-1,max);//extra -1 as the road is counted twice
        }
        return max;
    }
}
