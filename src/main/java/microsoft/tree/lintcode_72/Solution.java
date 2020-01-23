package microsoft.tree.lintcode_72;

import microsoft.tree.TreeNode;

public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length) {
            return null;
        }
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int instart, int inend,
                                 int[] postorder, int poststart, int postend) {
        if (instart > inend) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postend]);
        int position = findPosition(inorder, instart, inend, postorder[postend]);

        root.left = helper(inorder, instart, position - 1,
                postorder, poststart, poststart + position - instart - 1);
        root.right = helper(inorder, position + 1, inend,
                postorder, poststart + position - instart, postend - 1);
        return root;
    }

    private int findPosition(int[] arr, int start, int end, int key) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
