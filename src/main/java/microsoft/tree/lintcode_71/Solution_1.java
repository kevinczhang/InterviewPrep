package microsoft.tree.lintcode_71;

import microsoft.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_1 {
    /**
     * @param root: A Tree
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        boolean leftToRight = true;
        List<TreeNode> curLevel = new ArrayList<>();
        curLevel.add(root);
        while (!curLevel.isEmpty()) {
            List<Integer> curLevelNums = new ArrayList<>();
            for (int i = 0; i < curLevel.size(); i++) {
                curLevelNums.add(curLevel.get(i).val);
            }
            if (!leftToRight) {
                Collections.reverse(curLevelNums);
            }
            res.add(curLevelNums);
            leftToRight = !leftToRight;
            List<TreeNode> nextLevel = new ArrayList<>();
            for (int i = 0; i < curLevel.size(); i++) {
                if (curLevel.get(i).left != null)
                    nextLevel.add(curLevel.get(i).left);
                if (curLevel.get(i).right != null)
                    nextLevel.add(curLevel.get(i).right);
            }
            curLevel = new ArrayList<>(nextLevel);
        }

        return res;
    }
}
