// Title: N-Queens II
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/n-queens-ii/

        ans=0;
        dfs(new boolean[n][n] , 0 , n , new boolean[n]);
        return ans;
    }

    public void dfs(boolean[][] board , int  i , int n , boolean[] visited){
        if (i==n){
            ans++;
            return;
        }
        for (int j=0 ; j<n ; j++){
            if (!visited[j]){
                if (isValid(board,i,j,n)){
                    visited[j]=true;
                    board[i][j]=true;
                    dfs(board,i+1,n,visited);
                    board[i][j]=false;
                    visited[j]=false;
                }
            }
        }
    }
}
