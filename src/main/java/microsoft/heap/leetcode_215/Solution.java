package microsoft.heap.leetcode_215;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for(int num : nums){
            if(heap.size() < k)
                heap.add(num);
            else if(num > heap.peek()){
                heap.remove();
                heap.add(num);
            }
        }

        return heap.peek();
    }
}
