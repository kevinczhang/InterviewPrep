package microsoft.tree.lintcode_95;

import microsoft.tree.TreeNode;

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        return validateBST(root.left, (long)Integer.MIN_VALUE - 1, (long)root.val) &&
                validateBST(root.right, (long)root.val, (long)Integer.MAX_VALUE + 1);
    }

    private boolean validateBST(TreeNode treeNode, long min, long max) {
        if (treeNode == null) return true;

        if (treeNode.val <= min || treeNode.val >= max) return false;

        return validateBST(treeNode.left, min, treeNode.val) &&
                validateBST(treeNode.right, treeNode.val, max);
    }
}
