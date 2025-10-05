// Title: Pacific Atlantic Water Flow
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/pacific-atlantic-water-flow/

        }
                }
            }
                    atlantic[li][lj]=true;
                if (li>=0 && lj>=0 && li<m && lj<n && !atlantic[li][lj] && heights[li][lj]>=heights[i][j]){
                    que.add(new int[]{li,lj});
            for (int[] dir : dirs){
                int li = i+dir[0];
                int lj = j+dir[1];
        while(!que.isEmpty()){
            int i=que.peek()[0];
            int j=que.poll()[1];
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0 ; i<m ; i++){
            que.add(new int[]{i,0});
            pacific[i][0]=true;
        }
        for (int i=1 ; i<n ; i++){
            que.add(new int[]{0,i});
            pacific[0][i]=true;
        }
        while(!que.isEmpty()){
            int i=que.peek()[0];
            int j=que.poll()[1];
            if (atlantic[i][j]) ans.add(new ArrayList<>(Arrays.asList(i,j)));
        boolean[][] pacific = new boolean[m][n];
