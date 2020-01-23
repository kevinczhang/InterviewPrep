package microsoft.tree.lintcode_94;

import microsoft.tree.TreeNode;

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    public int maxPathSum(TreeNode root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        calculateSum(root, max);
        return max[0];
    }

    int calculateSum(TreeNode root, int[] max) {
        if (root == null) return 0;

        int left = calculateSum(root.left, max);
        int right = calculateSum(root.right, max);

        int current = Math.max(root.val, Math.max(root.val + left, root.val + right));
        max[0] = Math.max(max[0], Math.max(current, left + root.val + right));

        return current;
    }
}
