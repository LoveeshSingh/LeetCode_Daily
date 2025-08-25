// Title: Find Minimum Time to Reach Last Room I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-minimum-time-to-reach-last-room-i/

        pq.add(new ArrayList<>(Arrays.asList(0,0,0)));
        // pq.add(new ArrayList<>(Arrays.asList(1,1,0)));   
        while(!pq.isEmpty()){
            List<Integer> list = pq.poll();
            int time=list.get(0);
            int i=list.get(1);
            int j=list.get(2);
            for (int[] dir : dirs){
                int ni=i+dir[0];
                int nj=j+dir[1];
                if (ni>=0 && nj>=0 && ni<n && nj<m && move[ni][nj]!=-1){
                    if (ni==n-1 && nj==m-1) return Math.max(time+1,move[ni][nj]+1);
                    pq.add(new ArrayList<>(Arrays.asList(Math.max(move[ni][nj]+1,time+1),ni,nj)));
                }
            }
            move[i][j]=-1;
        }  
        return -1;   
        Queue<List<Integer>> pq = new PriorityQueue<>((i,j)->Integer.compare(i.get(0),j.get(0)));
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        int m = move[0].length;
        int n = move.length;
    public int minTimeToReach(int[][] move) {
    }
            if (move[i][j]==-1) continue;
