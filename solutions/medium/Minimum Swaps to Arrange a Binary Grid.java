// Title: Minimum Swaps to Arrange a Binary Grid
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/

        int[] cnt0 = new int[grid.length];
        for (int i=0 ; i<grid.length ; i++){
            int j=grid[0].length-1;
            for (;j>=0;j--){
                if (grid[i][j]==1) break;
            }
        }
            cnt0[i]=grid[0].length-1-j;
        for (int i=0 ; i<cnt0.length-1 ; i++){
            for(int j=i; j<cnt0.length ; j++){
        }
                if (cnt0[j]>=grid[0].length-i-1){
            }
            int val = -1;
                    val=j;
                }
                    break;
            if (val==-1) return -1;
            for (int j=val ; j>i ; j--){
        int ans=0;
            ans+=val-i;
                int temp = cnt0[j];
            }
    }
                cnt0[j]=cnt0[j-1];
                cnt0[j-1]=temp;
        return ans;
