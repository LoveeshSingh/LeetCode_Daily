// Title: Minimum Score After Removals on a Tree
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-score-after-removals-on-a-tree/

        int fa,
        int[] nums,
        List<List<Integer>> adj,
        int[] sum,
        int[] in,
        int[] out,
        int[] cnt
    ) {
        in[x] = cnt[0]++;
        sum[x] = nums[x];
        for (int y : adj.get(x)) {
            if (y == fa) {
                continue;
            }
            dfs(y, x, nums, adj, sum, in, out, cnt);
            sum[x] ^= sum[y];
        }
        out[x] = cnt[0];
    }
}