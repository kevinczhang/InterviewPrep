package microsoft.design.lintcode_442;

import java.util.HashMap;

public class TrieNode2 {
    // Initialize your data structure here.
    char c;
    HashMap<Character, TrieNode2> children = new HashMap<Character, TrieNode2>();
    boolean hasWord;

    public TrieNode2(){

    }

    public TrieNode2(char c){
        this.c = c;
    }
}
