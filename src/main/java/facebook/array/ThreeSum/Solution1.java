package facebook.array.ThreeSum;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution1 {
	public List<List<Integer>> threeSumWithReuse(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        boolean hasZero = false;
        // First element only be used once
        for (int i = 0; i < nums.length - 2; i++) {
        	if(nums[i] == 0)
        		hasZero = true;
        	// remove duplicate for left most element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
            while (lo < hi) {
                if (nums[lo] + nums[hi] < sum) {
                    lo++;
                    continue;
                } else if (nums[lo] + nums[hi] > sum) {
                    hi--;
                    continue;
                }

                res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                // Remove duplicate for lo element
                while (lo < hi && nums[lo] == nums[lo + 1]) {
                    lo++;
                }
                // Remove duplicate for hi element
                while (lo < hi && nums[hi] == nums[hi - 1]) {
                    hi--;
                }
                lo++;
                hi--;
            }
        }
        
        if(hasZero)
        	res.add(Arrays.asList(0, 0, 0));
        
        // First element used twice
        for (int i = 0; i < nums.length - 2; i++) {
        	// remove duplicate for left most element
            if (i > 0 && nums[i] == nums[i - 1] || 
            		nums[i] == nums[i+1] || nums[i] == 0) {
                continue;
            }
            
            if(nums[i] > 0){
            	for(int j = 0; j < i; j++){            		
            		if(nums[j] + 2*nums[i] == 0)
            			res.add(Arrays.asList(nums[i], nums[i], nums[j]));
            	}
            }
            
            for(int j = i+1; j < nums.length; j++){
        		if(nums[j] + 2*nums[i] == 0)
        			res.add(Arrays.asList(nums[i], nums[i], nums[j]));
        	}
        }
        
        // General method to remove duplicate in list
//        Set<List<Integer>> depdupeCustomers = new LinkedHashSet<>(res);
//        res.clear();
//        res.addAll(depdupeCustomers);
        
        return res;
    }
}
