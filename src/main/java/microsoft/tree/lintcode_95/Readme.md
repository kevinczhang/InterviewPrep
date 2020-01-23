## Validate Binary Search Tree

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

- The left subtree of a node contains only nodes with keys **less than** the node's key.
- The right subtree of a node contains only nodes with keys **greater than** the node's key.
- Both the left and right subtrees must also be binary search trees.
- A single node tree is a BST

### Example
**Example 1:**
```
Input:  {-1}
Output：true
Explanation：
For the following binary tree（only one node）:
	      -1
This is a binary search tree.
```

**Example 2:**
```
Input:  {2,1,4,#,#,3,5}
Output: true
For the following binary tree:
	  2
	 / \
	1   4
	   / \
	  3   5
This is a binary search tree.
```

### Solution Algorithm

Use (long)Integer.MIN_VALUE -1 and (long)Integer.MAX_VALUE + 1