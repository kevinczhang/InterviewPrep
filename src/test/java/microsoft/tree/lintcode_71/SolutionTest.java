package microsoft.tree.lintcode_71;

import microsoft.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void zigzagLevelOrder() {
        Solution_1 solutionToTest = new Solution_1();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<List<Integer>> res = solutionToTest.zigzagLevelOrder(root);
        assertEquals(res.size(), 2);
    }
}