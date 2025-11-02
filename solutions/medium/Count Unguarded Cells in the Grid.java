// Title: Count Unguarded Cells in the Grid
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-unguarded-cells-in-the-grid/

                    vertical[x][j]=true;
                    if (!horizon[x][j]) ans--;
                }
                else break;
            }
            for (int y = j+1 ; y<n ; y++){
                if (!horizon[i][y]){
                    horizon[i][y]=true;
                    if (!vertical[i][y]) ans--;
                }
                else break;
            }
            for (int y = j-1 ; y>=0 ; y--){
                if (!horizon[i][y]){
                    horizon[i][y]=true;
                    if (!vertical[i][y]) ans--;
                }
                else break;
            }
        }
        return ans;
    }
}
