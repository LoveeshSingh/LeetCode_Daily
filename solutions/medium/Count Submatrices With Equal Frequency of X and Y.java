// Title: Count Submatrices With Equal Frequency of X and Y
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y/

        for (int i=1 ; i<grid.length ; i++){
            for (int j=1 ; j<grid[0].length ; j++){
                dpx[i][j]=dpx[i][j-1]+dpx[i-1][j]-dpx[i-1][j-1];
        }
        for (int j=1 ; j<grid[0].length ; j++){
            dpx[0][j]=dpx[0][j-1];
        }
            if (grid[i][0]=='X') dpx[i][0]+=1;
            else if (grid[i][0]=='Y') dpy[i][0]+=1;
            dpy[0][j]=dpy[0][j-1];
            if (grid[0][j]=='X') dpx[0][j]+=1;
            else if (grid[0][j]=='Y') dpy[0][j]+=1;
                dpy[i][j]=dpy[i][j-1]+dpy[i-1][j]-dpy[i-1][j-1];
                if (grid[i][j]=='X') dpx[i][j]+=1;
                else if (grid[i][j]=='Y') dpy[i][j]+=1;
            if (dpx[i][0]>=1 && dpx[i][0]==dpy[i][0]) cnt++;
            if (dpx[0][j]>=1 && dpx[0][j]==dpy[0][j]) cnt++;
            dpy[i][0]=dpy[i-1][0];
            dpx[i][0]=dpx[i-1][0];
        else if (grid[0][0]=='Y') dpy[0][0]=1;
        for (int i=1 ; i<grid.length ; i++){
                if (dpx[i][j]>=1 && dpx[i][j]==dpy[i][j]) cnt++;
            }
        }
        return cnt;
    }
}
