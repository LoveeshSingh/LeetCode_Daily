// Title: Ones and Zeroes
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/ones-and-zeroes/

                freq[i][c-'0']++;
            }
        }
        int[][] dp = new int[m+1][n+1];
        for (int i=0 ; i<freq.length ; i++){
            for (int j=m ; j>=freq[i][0] ; j--){
        }
                for (int k=n ; k>=freq[i][1] ; k--){
            }
                    dp[j][k]=Math.max(dp[j-freq[i][0]][k-freq[i][1]]+1,dp[j][k]);
                }
    }
        return dp[m][n];
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] freq = new int[strs.length][2];
        for (int i=0 ; i<strs.length ; i++){
            for (char c : strs[i].toCharArray()){
}
