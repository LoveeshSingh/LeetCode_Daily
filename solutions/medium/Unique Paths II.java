// Title: Unique Paths II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/unique-paths-ii/

        }
            else grid[0][j]=1;
        for (int i=1 ; i<m ; i++){
            if (grid[i][0]==1 || obstacle){
                obstacle=true;
                grid[i][0]=0;
            } 
            else grid[i][0]=1;
        }
        obstacle=false;

        for (int i=1 ; i<m ; i++){
            for (int j=1 ; j<n ; j++){
                if (grid[i][j]==1) grid[i][j]=0;
                else{
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
            }
        }
        return grid[m-1][n-1];
    }
}