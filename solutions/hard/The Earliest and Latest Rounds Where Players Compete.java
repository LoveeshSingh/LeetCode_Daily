// Title: The Earliest and Latest Rounds Where Players Compete
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/the-earliest-and-latest-rounds-where-players-compete/

        if (s <= n_half) {
        int n_half = (n + 1) / 2;
        int latest = Integer.MIN_VALUE;
        int earliest = Integer.MAX_VALUE;

        }
            return new int[] { F[n][f][s], G[n][f][s] };
            G[n][f][s] = res[1];
            F[n][f][s] = res[0];
            int[] res = dp(n, n + 1 - s, n + 1 - f);
        if (f + s > n + 1) {
        // F(n,f,s) = F(n, n + 1 - s, n + 1 - f)
        }
            // On the left or in the middle
            for (int i = 0; i < f; ++i) {
                for (int j = 0; j < s - f; ++j) {
                    int[] res = dp(n_half, i + 1, i + j + 2);
                    earliest = Math.min(earliest, res[0]);
                    latest = Math.max(latest, res[1]);
                }
            }
        } else {
            // s on the right
            int s_prime = n + 1 - s;
            int mid = (n - 2 * s_prime + 1) / 2;
