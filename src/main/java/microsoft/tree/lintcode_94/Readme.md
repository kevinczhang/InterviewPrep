## 94. Binary Tree Maximum Path Sum

Given a binary tree, find the maximum path sum.

The path may start and end at any node in the tree.

### Example
**Example 1:**
```
Input:  For the following binary tree（only one node）:
	2
	Output：2
```

**Example 2:**
```
Input:  For the following binary tree:

      1
     / \
    2   3
		
	Output: 6
```
	
## Solution Algorithm
```
Recursively calculate by subtrees
1. if null return 0
2. calculate left and right subtrees
3. calculate and return local max of local root or +left or +right
4. calculate global max of global, local max, and +left+right
```	
	

