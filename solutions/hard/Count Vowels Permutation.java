// Title: Count Vowels Permutation
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/count-vowels-permutation/

class Solution {
    public int countVowelPermutation(int n) {
        int[][] arr = new int[][]{{1,2,4},{0,2},{1,3},{2},{2,3}};        
        long[][] dp = new long[n][5];
        for (int j=0 ; j<5 ; j++) dp[0][j]=1;
        for (int i=1 ; i<n ; i++){
            for (int j=0 ; j<5 ; j++){
        }
                for (int k : arr[j]){
            }
                    dp[i][j]=(dp[i][j]+dp[i-1][k])%mod;
                }
    }
        return(int)(ans%mod);
        long ans =0;
        for (int i=0 ; i<5 ; i++) ans+=dp[n-1][i];
    final int mod=1000000007;
}