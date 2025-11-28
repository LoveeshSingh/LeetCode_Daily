// Title: Maximum Number of K-Divisible Components
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-number-of-k-divisible-components/

        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0 ; i<n ; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
        }
    }

    public long dfs(int i , List<List<Integer>> adj ,  int[] values , int last , int k){
            adj.get(edge[1]).add(edge[0]);
        long sum = values[i];
        for (int next : adj.get(i)){
            if (next==last) continue;
        }
            sum+=dfs(next,adj,values,i,k);
        if (sum%k==0){
        return sum%k;
        return ans;
        dfs(0,adj,values,-1,k);
            ans++;
        }
    }
}
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
