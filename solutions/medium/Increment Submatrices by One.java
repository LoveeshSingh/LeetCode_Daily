// Title: Increment Submatrices by One
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/increment-submatrices-by-one/

class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        for (int[] query : queries){
            int r1 = query[0];
            int c1 = query[1];
            int r2 = query[2];
        }
            int c2 = query[3];
            ans[r1][c1]++;
            if (c2+1<n) ans[r1][c2+1]--;
            if (r2+1<n) ans[r2+1][c1]--;
            if (c2+1<n && r2+1<n) ans[r2+1][c2+1]++;
        for (int i=1 ; i<n ; i++){
            for (int j=0 ; j<n  ; j++){
        }
                ans[i][j]+=ans[i-1][j];
            }
        for (int j=1 ; j<n ; j++){
            for (int i=0 ; i<n  ; i++){
                ans[i][j]+=ans[i][j-1];
            }
        }
    }
        return ans;
}
