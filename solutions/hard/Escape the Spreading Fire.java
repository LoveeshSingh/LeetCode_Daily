// Title: Escape the Spreading Fire
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/escape-the-spreading-fire/


    public int traceHuman(int[][] grid){
        Queue<int[]> que = new PriorityQueue<>((i,j)->Integer.compare(j[3],i[3]));
        que.add(new int[]{0,0,0,Integer.MAX_VALUE});
        while(!que.isEmpty()){
            int i= que.peek()[0];
            int j= que.peek()[1];
            int t= que.peek()[2];
            int ans= que.poll()[3];
            if (i==grid.length-1 && j==grid[0].length-1) return Math.min(ans,grid[i][j]-t);
            if (i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]<=0) continue;
            if (grid[i][j]>t){
                ans=Math.min(ans,grid[i][j]-t-1);
                que.add(new int[]{i+1,j,t+1,ans});
                que.add(new int[]{i-1,j,t+1,ans});
                que.add(new int[]{i,j+1,t+1,ans});
                que.add(new int[]{i,j-1,t+1,ans});
                grid[i][j]=-1;
            }
        }
        return -1;
    }
    public int maximumMinutes(int[][] grid) {
        grid = traceFire(grid);
        int ans = traceHuman(grid);
        if (ans>=1000000000) return 1000000000;
