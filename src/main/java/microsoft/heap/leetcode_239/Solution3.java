package microsoft.heap.leetcode_239;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution3 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        int i = 0;
        Queue<Integer> pq = new PriorityQueue<Integer>(k, revComp);
        while(i < nums.length && i < k)
            pq.offer(nums[i++]);
        res[0] = pq.peek();
        if(i < k-1){
            return res;
        }
        int resInd = 1;
        while(i < nums.length){
            pq.remove(nums[i-k]);
            pq.offer(nums[i++]);
            res[resInd++] = pq.peek();
        }
        return res;
    }

    static final Comparator<Integer> revComp = new Comparator<Integer>(){
        public int compare(Integer n1, Integer n2){
            return n2 - n1;
        }
    };
}
