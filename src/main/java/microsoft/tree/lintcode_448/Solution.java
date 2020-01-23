package microsoft.tree.lintcode_448;

import microsoft.tree.TreeNode;

public class Solution {
    /*
     * @param root: The root of the BST.
     * @param p: You need find the successor node of p.
     * @return: Successor of p.
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (p == null) return null;
        if (p.right != null) {
            TreeNode cur = p.right;
            while(cur.left != null)
                cur = cur.left;
            return cur;
        }
        return findInorderSuccessor(root, p, null);
    }

    private TreeNode findInorderSuccessor(TreeNode treeNode, TreeNode targetNode, TreeNode cur) {
        if (treeNode == targetNode) {
            return cur;
        }

        if (treeNode.val < targetNode.val) {
            return findInorderSuccessor(treeNode.right, targetNode, cur);
        } else {
            return findInorderSuccessor(treeNode.left, targetNode, treeNode);
        }
    }
}
