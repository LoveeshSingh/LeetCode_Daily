// Title: Find the Maximum Length of Valid Subsequence II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-ii/

class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int res = 0;
        for (int num : nums) {
            num %= k;
            for (int prev = 0; prev < k; prev++) {
                dp[prev][num] = dp[num][prev] + 1;
                res = Math.max(res, dp[prev][num]);
            }
        }
        return res;
    }
}
