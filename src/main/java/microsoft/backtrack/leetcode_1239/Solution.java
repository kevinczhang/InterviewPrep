package microsoft.backtrack.leetcode_1239;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int maxLength(List<String> arr) {
        if (arr == null || arr.size() == 0) return 0;
        int[] max = new int[1];
        helper(arr, 0, new StringBuilder(), max);
        return max[0];
    }

    public void helper(List<String> arr, int index, StringBuilder sb, int[] max) {
        if (validate(sb)) max[0] = Math.max(max[0], sb.length());
        if (!validate(sb)) return;
        if (index == arr.size()) return;
        int length = sb.length();
        sb.append(arr.get(index));
        helper(arr, index + 1, sb, max);
        sb.setLength(length);
        helper(arr, index + 1, sb, max);
    }

    public boolean validate(StringBuilder sb) {
        String curr = sb.toString();
        Set<Character> set = new HashSet<>();

        for (char c : curr.toCharArray()) {
            if (!set.add(c)) return false;
        }
        return true;
    }
}
