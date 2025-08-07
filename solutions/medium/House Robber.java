// Title: House Robber
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/house-robber/

class Solution {
    public int rob(int[] nums) {
        for (int i=2 ; i<nums.length ; i++){
            dp[i]=max+nums[i];
        }
    }
        return Math.max(dp[nums.length-2],dp[nums.length-1]);
        if (nums.length==1) return nums[0];
        int max=dp[0];
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
            max=Math.max(max,dp[i-1]);
}