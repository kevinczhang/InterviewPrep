package microsoft.trie.leetcode_208;

public class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public String item = "";

    // Initialize your data structure here.
    public TrieNode() {

    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
