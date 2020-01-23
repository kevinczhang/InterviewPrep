## 453. Flatten Binary Tree to Linked List

Flatten a binary tree to a fake "linked list" in pre-order traversal.

Here we use the right pointer in TreeNode as the next pointer in ListNode.

###Example
**Example 1:**
```
Input:{1,2,5,3,4,#,6}
Output：{1,#,2,#,3,#,4,#,5,#,6}
Explanation：
     1
    / \
   2   5
  / \   \
 3   4   6

1
\
 2
  \
   3
    \
     4
      \
       5
        \
         6
```

**Example 2:**
```
Input:{1}
Output:{1}
Explanation：
         1
         1
```

###Challenge
Do it in-place without any extra memory.