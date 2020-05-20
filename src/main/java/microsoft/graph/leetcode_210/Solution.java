package microsoft.graph.leetcode_210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        List<Integer>[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            if (graph[prerequisite[1]] == null) {
                graph[prerequisite[1]] = new ArrayList<>();
            }
            graph[prerequisite[1]].add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        // 用idx记录输出数组的下标
        int idx = 0;
        while(!queue.isEmpty()){
            Integer curr = queue.poll();
            res[idx++] = curr;
            if(graph[curr] == null) continue;
            for(Integer next : graph[curr]){
                if(--indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
        // 如果有环则返回空数组
        return idx != numCourses ? new int[0] : res;
    }
}
