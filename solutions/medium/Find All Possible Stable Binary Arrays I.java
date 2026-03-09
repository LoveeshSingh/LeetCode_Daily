// Title: Find All Possible Stable Binary Arrays I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-all-possible-stable-binary-arrays-i/

        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {
                if (i > limit) {
                    dp[i][j][0] =
                        dp[i - 1][j][0] +
                        dp[i - 1][j][1] -
                        dp[i - limit - 1][j][1];
                } else {
                    dp[i][j][0] = dp[i - 1][j][0] + dp[i - 1][j][1];
                }
                dp[i][j][0] = ((dp[i][j][0] % MOD) + MOD) % MOD;
                if (j > limit) {
                    dp[i][j][1] =
                        dp[i][j - 1][1] +
        }
            dp[i][0][0] = 1;
        }
        for (int j = 0; j <= Math.min(one, limit); j++) {
            dp[0][j][1] = 1;
class Solution {

    public int numberOfStableArrays(int zero, int one, int limit) {
        final long MOD = 1000000007;
        long[][][] dp = new long[zero + 1][one + 1][2];
        for (int i = 0; i <= Math.min(zero, limit); i++) {
