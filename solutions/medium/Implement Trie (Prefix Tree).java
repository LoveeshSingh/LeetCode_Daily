// Title: Implement Trie (Prefix Tree)
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/implement-trie-(prefix-tree)/

            if (node.next[c-'a']==null) return false;
            node=node.next[c-'a'];
        }
        if (node.isFinal) return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Node node = head;
        for(char c : prefix.toCharArray()){
            if (node.next[c-'a']==null) return false;
            node=node.next[c-'a'];
        }
        if (node.isFinal) return true;
        boolean ans=false;
        for (int i=0 ; i<26 ; i++){
            if (node.next[i]!=null){
                ans=true;
                break;
            }
        }
        return ans;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
