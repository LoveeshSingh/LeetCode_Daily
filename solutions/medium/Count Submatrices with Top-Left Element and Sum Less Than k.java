// Title: Count Submatrices with Top-Left Element and Sum Less Than k
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/

class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        for (int i=1 ; i<grid.length ; i++){
            grid[i][0]+=grid[i-1][0];
        }
        for (int j=1 ; j<grid[0].length ; j++){
            grid[0][j]+=grid[0][j-1];
        }


        if (grid[0][0]>k) return 0;
        int cnt=1;
            if (grid[i][0]<=k) cnt++;
            if (grid[0][j]<=k) cnt++;

        for (int i=1 ; i<grid.length ; i++){
            for (int j=1 ; j<grid[0].length ; j++){
        }
                grid[i][j] += grid[i-1][j]+grid[i][j-1]-grid[i-1][j-1];
            }
    }
                if (grid[i][j]<=k) cnt++;
        return  cnt;
}
