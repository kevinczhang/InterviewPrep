## 665. Non-decreasing Array

Given an array with n integers, your task is to check if it could become non-decreasing by modifying at **most 1** element.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

**Example 1:**
```
Input: [4,2,3]
Output: True
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
```

**Example 2:**
```
Input: [4,2,1]
Output: False
Explanation: You can't get a non-decreasing array by modify at most one element.
```

**Note:** The n belongs to [1, 10,000].

## Alogrithm:
从头开始模拟，碰到第一次nums[i]<nums[i-1]时，我们需要修改nums[i]或者nums[i-1]来保证数组的不下降。
有两种情况：
1. nums[i]<nums[i-2]，比如3,4,2这样的情况，当前nums[i]=2。此时我们只能将nums[i]修改为4，才能在满足题意的条件下保证数组不下降，修改后为3,4,4。
2. nums[i]>=nums[i-2]，比如3,5,4，当前nums[i]=4。此时我们可以将nums[i-1]修改为4，修改后为3,4,4。