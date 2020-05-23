package facebook.tree.lowestcommonancestorofabinarytree236;

import facebook.tree.common.TreeNode;

/**
 * Created by czhang on 1/4/2017.
 */
public class RecursiveSolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}
