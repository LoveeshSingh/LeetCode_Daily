// Title: Redundant Connection
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/redundant-connection/

    boolean union(int x , int y){
        int u = find(x);
        int v = find(y);
        if (u==v) return false;
        if (size[u]>size[v]){
            parent[v]=u;
        }
        else{
            parent[u]=v;
            size[u]+=v;
            size[v]+=u;
        }
    }
        return true;

    }
        return parent[x]; 
}

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length);
        for (int[] edge : edges){
            if (!dsu.union(edge[0]-1,edge[1]-1)) return edge;
        }
        return new int[]{};
    }
}
