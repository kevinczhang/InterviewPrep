package microsoft.graph.leetcode_207;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0) {
            return true;
        }
        //course-number of pre-courses
        int[] countOfPre = new int[numCourses];
        for (int[] tmp : prerequisites) {
            countOfPre[tmp[0]]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        int visitedCount = 0;
        for (int i = 0; i < numCourses; i++) { //add all source
            if (countOfPre[i] == 0) {
                queue.add(i);
            }
        }
        if (queue.isEmpty()) {
            return false;
        }
        if (queue.size() == numCourses) {
            return true;
        }

        visitedCount = queue.size();
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int[] tmp : prerequisites) {
                if (tmp[1] == cur) {
                    countOfPre[tmp[0]]--;
                    if (countOfPre[tmp[0]] == 0) {
                        queue.offer(tmp[0]);
                        visitedCount++;
                    }
                }
            }
        }
        return visitedCount == numCourses;
    }
}
