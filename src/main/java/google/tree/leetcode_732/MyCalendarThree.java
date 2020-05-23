package google.tree.leetcode_732;

import java.util.Map;
import java.util.TreeMap;

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */
public class MyCalendarThree {

    Map<Integer, Integer> treeMap;

    public MyCalendarThree() {
        treeMap = new TreeMap<>();
    }

    public int book(int start, int end) {
        int res = 0;
        int happening = 0;
        treeMap.put(start, treeMap.getOrDefault(start, 0) + 1);
        treeMap.put(end, treeMap.getOrDefault(end, 0) - 1);

        for (int e: treeMap.values()) {
            res = Math.max(res, happening += e);
        }

        return res;
    }

}
