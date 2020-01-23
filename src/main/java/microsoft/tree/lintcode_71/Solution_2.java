package microsoft.tree.lintcode_71;

import microsoft.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution_2 {
    /**
     * @param root: A Tree
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Deque<TreeNode> curNodeQue = new ArrayDeque<>();

        curNodeQue.offerFirst(root);
        boolean leftToRight = true;
        while(!curNodeQue.isEmpty()){
            Deque<TreeNode> nextNodeQue = new ArrayDeque<>();
            List<Integer> curLevel= new ArrayList<>();
            while(!curNodeQue.isEmpty()){
                TreeNode curNode = leftToRight ? curNodeQue.pollFirst() : curNodeQue.pollLast();
                curLevel.add(curNode.val);
                if(leftToRight){
                    if(curNode.left != null){
                        nextNodeQue.offerLast(curNode.left);
                    }
                    if(curNode.right != null){
                        nextNodeQue.offerLast(curNode.right);
                    }
                } else {
                    if(curNode.right != null){
                        nextNodeQue.offerFirst(curNode.right);
                    }
                    if(curNode.left != null){
                        nextNodeQue.offerFirst(curNode.left);
                    }
                }
            }
            curNodeQue = new ArrayDeque(nextNodeQue);
            res.add(curLevel);
            leftToRight = !leftToRight;
        }
        return res;
    }
}
