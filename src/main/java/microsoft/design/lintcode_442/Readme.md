## 442. Implement Trie (Prefix Tree)

Implement a Trie with insert, search, and startsWith methods.

**Examples**

**Example 1:**
```
Input:
  insert("lintcode")
  search("lint")
  startsWith("lint")
Output:
  false
  true
```

**Example 2:**

```
Input:
  insert("lintcode")
  search("code")
  startsWith("lint")
  startsWith("linterror")
  insert("linterror")
  search("lintcode“)
  startsWith("linterror")
Output:
  false
  true
  false
  true
  true
```
