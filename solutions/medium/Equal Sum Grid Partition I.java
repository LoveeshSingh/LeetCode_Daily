// Title: Equal Sum Grid Partition I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/equal-sum-grid-partition-i/

class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int[] vert = new int[grid.length];
        int[] hor = new int[grid[0].length];
        for (int i=0 ; i<grid.length ; i++){
            for (int j=0 ; j<grid[0].length ; j++){
                vert[i]+=grid[i][j];
            }
        }
                hor[j]+=grid[i][j];
        long sum = 0;
                sum+=grid[i][j];
        for (int i=0 ; i<vert.length-1  ; i++){ 
            tot+=vert[i];
        }
        long tot=0;
            if (tot==sum/2) return true;
        if(sum%2!=0) return false;
        tot=0;
        for (int i=0 ; i<hor.length-1  ; i++){ 
            tot+=hor[i];
            if (tot==sum/2) return true;
        }
    }
        return false;
}
