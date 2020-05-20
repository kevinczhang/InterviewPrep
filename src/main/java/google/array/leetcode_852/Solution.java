package google.array.leetcode_852;

public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > A[mid - 1]) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (A[start] > A[start - 1] && A[start] > A[start + 1]) {
            return start;
        }
        else {
            return end;
        }
    }
}
