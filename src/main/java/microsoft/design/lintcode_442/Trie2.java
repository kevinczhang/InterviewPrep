package microsoft.design.lintcode_442;

import java.util.HashMap;

public class Trie2 {
    private TrieNode2 root;

    public Trie2() {
        root = new TrieNode2();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode2 cur = root;
        HashMap<Character, TrieNode2> curChildren = root.children;
        char[] wordArray = word.toCharArray();
        for(int i = 0; i < wordArray.length; i++){
            char wc = wordArray[i];
            if(curChildren.containsKey(wc)){
                cur = curChildren.get(wc);
            } else {
                TrieNode2 newNode = new TrieNode2(wc);
                curChildren.put(wc, newNode);
                cur = newNode;
            }
            curChildren = cur.children;
            if(i == wordArray.length - 1){
                cur.hasWord= true;
            }
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if(searchWordNodePos(word) == null){
            return false;
        } else if(searchWordNodePos(word).hasWord)
            return true;
        else return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(searchWordNodePos(prefix) == null){
            return false;
        } else return true;
    }

    public TrieNode2 searchWordNodePos(String s){
        HashMap<Character, TrieNode2> children = root.children;
        TrieNode2 cur = null;
        char[] sArray = s.toCharArray();
        for(int i = 0; i < sArray.length; i++){
            char c = sArray[i];
            if(children.containsKey(c)){
                cur = children.get(c);
                children = cur.children;
            } else{
                return null;
            }
        }
        return cur;
    }
}
