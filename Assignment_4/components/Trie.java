package components;

class Trie {

    class TrieNode {
        TrieNode[] children; // a (resizable or fixed size) array of size 26
        boolean validWord; // boolean to indicate if this node marks the end of a word

        TrieNode() {
            children = new TrieNode[26];
            validWord = false;
        }
    }

    TrieNode root;

    void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.validWord = true;
    }

    boolean isValidWord(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (currentNode.children[index] == null) {
                return false;
            }
            currentNode = currentNode.children[index];
        }
        return currentNode.validWord;
    }

    void remove(String word) {
        if (!isValidWord(word)) {
            return;
        }
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            currentNode.children[index].validWord = false;
            if (currentNode.children[index].children.length == 0) {
                currentNode.children[index] = null;
            }
            currentNode = currentNode.children[index];
        }
    }
}
