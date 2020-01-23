package microsoft.graph.leetcode_112;

import microsoft.graph.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null)
            return (sum == root.val);

        return hasPathSum(root.left, sum-root.val) ||
                hasPathSum(root.right, sum-root.val);
    }

    public boolean hasPathSumDFS(TreeNode root, int sum) {
        if (root == null)
            return false;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> queueVal = new Stack<Integer>();

        stack.push(root);
        queueVal.push(root.val);
        while (!stack.isEmpty()) {
            TreeNode u = stack.pop();
            int sumVal = queueVal.pop();

            if (u.left == null & u.right == null && sumVal == sum)
                return true;

            if (u.left != null) {
                stack.push(u.left);
                queueVal.push(sumVal + u.left.val);
            }

            if (u.right != null) {
                stack.push(u.right);
                queueVal.push(sumVal + u.right.val);
            }
        }

        return false;
    }

    public boolean hasPathSumBFS(TreeNode root, int sum) {
        if(root == null)return false;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> queueVal = new LinkedList<Integer>();

        queue.add(root);
        queueVal.add(root.val);
        while(!queue.isEmpty()){
            TreeNode u = queue.poll();
            int sumVal = queueVal.poll();

            if(u.left == null & u.right == null && sumVal == sum) return true;

            if(u.left != null){
                queue.add(u.left);
                queueVal.add(sumVal + u.left.val);
            }

            if(u.right != null){
                queue.add(u.right);
                queueVal.add(sumVal + u.right.val);
            }

        }

        return false;
    }
}
