// Title: Trapping Rain Water II
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/trapping-rain-water-ii/

            pq.add(new int[]{0,j,height[0][j]});
            pq.add(new int[]{m-1,j,height[m-1][j]});
            height[0][j]=-1;
            height[m-1][j]=-1;
        }
        int ans=0;
        while(!pq.isEmpty()){
            int i = pq.peek()[0];
            int j = pq.peek()[1];
            int ht = pq.poll()[2];
            for (int[] dir : dirns){
                int li = i+dir[0];
                int lj = j+dir[1];
        for (int j=1 ; j<n-1 ; j++){
        }
            height[i][n-1]=-1;
            height[i][0]=-1;
            pq.add(new int[]{i,n-1,height[i][n-1]});
            pq.add(new int[]{i,0,height[i][0]});
        Queue<int[]> pq = new PriorityQueue<>((i,j)->(i[2]-j[2]));
        for (int i=0 ; i<m ; i++){
        int m = height.length;
        int n = height[0].length;
        if (m==2 || n==2) return 0;
    public int trapRainWater(int[][] height) {
        int[][] dirns = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
class Solution {
