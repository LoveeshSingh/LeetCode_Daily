// Title: Swim in Rising Water
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/swim-in-rising-water/

        PriorityQueue<int[]> pq = new PriorityQueue<>((i,j)->(i[2]-j[2]));
        pq.add(new int[]{0,0,grid[0][0]});
        grid[0][0]=-1;
        while(!pq.isEmpty()){
            int i=pq.peek()[0];
        }
            int j=pq.peek()[1];
            int ht=pq.poll()[2];
            for (int[] dir : dirs){
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
                int li = i+dir[0];
            }
                int lj = j+dir[1];
                if (li>=0 && lj>=0 && li<m && lj<n && grid[li][lj]!=-1){
        int ans=0;
            if (i==m-1 && j==n-1) break;
                    pq.add(new int[]{li,lj,grid[li][lj]});
                }
    }
            ans=Math.max(ans,ht);
                    grid[li][lj]=-1;
        return ans;
}
        int n = grid[0].length;
class Solution {
    public int swimInWater(int[][] grid) {
        int m = grid.length;
