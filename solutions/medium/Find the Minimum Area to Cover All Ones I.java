// Title: Find the Minimum Area to Cover All Ones I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/

class Solution {
    public int minimumArea(int[][] grid) {
        int minV = grid.length;
        int maxV = -1;
        int minH = grid[0].length;
        int maxH = -1;
        for (int i=0 ; i<grid.length ; i++){
            for (int j=0 ; j<grid[0].length ; j++){
        }
                if (grid[i][j]==1){
            }
                    minV=Math.min(minV,i);
                }
    }
                    maxV=Math.max(maxV,i);
                    minH=Math.min(minH,j);
                    maxH=Math.max(maxH,j);
        if (maxV<minV) return 0;
        return (maxV-minV+1)*(maxH-minH+1);
}
