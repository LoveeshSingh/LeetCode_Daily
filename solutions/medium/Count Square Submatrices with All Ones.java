// Title: Count Square Submatrices with All Ones
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-square-submatrices-with-all-ones/

class Solution {
    public int countSquares(int[][] matrix) {
        for (int i=0 ; i<m ; i++){
            for (int j=0 ; j<n ; j++){
        }
                if (matrix[i][j]==1 && i!=0 && j!=0){
            }
    }
        int m = matrix.length;
        int n = matrix[0].length;
                    matrix[i][j]=Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]))+1;
                }
                ans+=matrix[i][j];
        int ans=0;
        return ans;
}
