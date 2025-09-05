// Title: Satisfiability of Equality Equations
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/satisfiability-of-equality-equations/

        return true;
    }
}

class Solution {
    public boolean equationsPossible(String[] equations) {
        DSU dsu = new DSU(26);
        for (String eqn : equations){
            if (eqn.charAt(1)=='='){
                dsu.union(eqn.charAt(0)-'a',eqn.charAt(3)-'a');
            }
        }
        for (String eqn : equations){
            if (eqn.charAt(1)=='!'){
                if (dsu.find(eqn.charAt(0)-'a')==dsu.find(eqn.charAt(3)-'a')) return false;
            }
        }
        return true;
    }
}
