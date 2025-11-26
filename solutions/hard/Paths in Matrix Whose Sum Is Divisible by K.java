// Title: Paths in Matrix Whose Sum Is Divisible by K
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/paths-in-matrix-whose-sum-is-divisible-by-k/

        long[][][] dp =  new long[grid.length][grid[0].length][k];
        dp[0][0][grid[0][0]%k]=1L;
        for (int j=1 ; j<grid[0].length ; j++){
        }
        int sum = grid[0][0];
            sum+=grid[0][j];
            dp[0][j][sum%k]=1L;
        for (int i=1 ; i<grid.length ; i++){
            sum+=grid[i][0];
            dp[i][0][sum%k]=1L;
        }
    public int numberOfPaths(int[][] grid, int k) {
        sum = grid[0][0];
        for (int i=1 ; i<grid.length ; i++){
            for (int j=1 ; j<grid[0].length ; j++){
        }
                for (int x=0 ; x<k ; x++){
            }
                    dp[i][j][x] = (dp[i][j-1][(x-(grid[i][j])%k+k)%k] + dp[i-1][j][(x-(grid[i][j])%k+k)%k])%MOD;
                }
    }
        return (int)dp[grid.length-1][grid[0].length-1][0];
class Solution {
        Long MOD = (long)1e9+7;
}
