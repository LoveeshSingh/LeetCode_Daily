// Title: Minimum Falling Path Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-falling-path-sum/

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        for (int i=1 ; i<n ;  i++){
            for(int j=0 ; j<n ; j++){
        }
                matrix[i][j]+=Math.min((j==0)?Integer.MAX_VALUE:matrix[i-1][j-1],Math.min(matrix[i-1][j],(j==n-1)?Integer.MAX_VALUE:matrix[i-1][j+1]));
            } 
        int ans=Integer.MAX_VALUE;
        for (int i=0 ; i<n ; i++){
            ans=Math.min(ans,matrix[n-1][i]);
        }
    }
        return ans;
}