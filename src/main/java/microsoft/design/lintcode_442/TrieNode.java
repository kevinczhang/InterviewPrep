package microsoft.design.lintcode_442;

class TrieNode {
    private TrieNode[] children;
    public boolean hasWord;

    public TrieNode() {
        children = new TrieNode[26];
        hasWord = false;
    }

    public void insert(String word, int index) {
        if (index == word.length()) {
            this.hasWord = true;
            return;
        }

        int pos = word.charAt(index) - 'a';
        if (children[pos] == null) {
            children[pos] = new TrieNode();
        }
        children[pos].insert(word, index + 1);
    }

    public TrieNode find(String word, int index) {
        if (index == word.length()) {
            return this;
        }

        int pos = word.charAt(index) - 'a';
        if (children[pos] == null) {
            return null;
        }
        return children[pos].find(word, index + 1);
    }
}
