// Title: Maximum Profit from Trading Stocks with Discounts
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-profit-from-trading-stocks-with-discounts/

        for (int[] e : hierarchy) {
        }
            g[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
        List<Integer>[] g = new ArrayList[n];
            g[e[0] - 1].add(e[1] - 1);
        }

        return dfs(0, present, future, g, budget).dp0[budget];
    }

    private Result dfs(
        int u,
        int[] present,
        int[] future,
        List<Integer>[] g,
        int budget
    ) {
        int cost = present[u];
        int dCost = present[u] / 2;
        // dp[u][state][budget]
        // state = 0: Do not purchase parent node, state = 1: Must purchase parent node
        int[] dp0 = new int[budget + 1];
        int[] dp1 = new int[budget + 1];

        // subProfit[state][budget]
        // state = 0: discount not available, state = 1: discount available
        int[] subProfit0 = new int[budget + 1];
