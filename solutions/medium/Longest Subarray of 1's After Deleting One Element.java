// Title: Longest Subarray of 1's After Deleting One Element
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-subarray-of-1's-after-deleting-one-element/

class Solution {
    public int longestSubarray(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i=1 ; i<n ; i++){
            if (nums[i-1]==1) cnt++;
        }
        int n=nums.length;
        int cnt=0;
            else cnt=0;
            dp[i]=cnt;
        for (int i=n-2 ; i>=0 ; i--){
            if (nums[i+1]==1) cnt++;
        }
    }
        int ans = cnt;
        cnt=0;
            else cnt=0;
            ans=Math.max(ans,dp[i]+cnt);
        return  ans;
}
