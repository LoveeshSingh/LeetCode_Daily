// Title: Number of People Aware of a Secret
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-people-aware-of-a-secret/

class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n+1];
        for (int i=1 ; i<=delay ; i++) dp[i]=1;
        for (int i=delay+1 ; i<=n ; i++){
            dp[i]=(dp[i-1]+cnt)%mod;
        } 
        return (int) cnt;
    }
    final int mod = 1000000007;
            long cnt= (dp[i-delay]-((i-forget>=0)?dp[i-forget]:0)+mod)%mod;
        long cnt = (dp[n]-dp[n-forget]+mod)%mod;
}
