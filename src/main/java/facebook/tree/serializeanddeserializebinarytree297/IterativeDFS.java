package facebook.tree.serializeanddeserializebinarytree297;


import facebook.tree.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by czhang on 1/4/2017.
 */
public class IterativeDFS {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        TreeNode x = root;
        Deque<TreeNode> stack = new LinkedList<>();
        while (x != null || !stack.isEmpty()) {
            if (x != null) {
                sb.append(String.valueOf(x.val));
                sb.append(' ');
                stack.push(x);
                x = x.left;
            } else {
                sb.append("null ");
                x = stack.pop();
                x = x.right;
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0){
            return null;
        }
        String[] node = data.split(" ");
        int n = node.length;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(node[0]));
        TreeNode x = root;
        stack.push(x);

        int i = 1;
        while (i < n) {
            while (i < n && !node[i].equals("null")) {
                x.left = new TreeNode(Integer.valueOf(node[i++]));
                x = x.left;
                stack.push(x);
            }
            while (i < n && node[i].equals("null")) {
                x = stack.pop();
                i++;
            }
            if (i < n) {
                x.right = new TreeNode(Integer.valueOf(node[i++]));
                x = x.right;
                stack.push(x);
            }
        }
        return root;
    }
}
