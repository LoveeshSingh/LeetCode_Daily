// Title: Number of Operations to Make Network Connected
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-operations-to-make-network-connected/

        }
        else{
            size[u]+=size[v];
            parent[v]=u;
            parent[u]=v;
            size[v]+=size[u];
        }
        return true;
    }
}


class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length<n-1) return -1;
        DSU dsu = new DSU(n);
        for (int[] cnctn : connections){
            dsu.union(cnctn[0],cnctn[1]);
        }
        HashSet<Integer> parents = new HashSet<>();
        for (int i=0 ; i<n ; i++){
            parents.add(dsu.find(i));
        }
        return parents.size()-1;
    }
}
