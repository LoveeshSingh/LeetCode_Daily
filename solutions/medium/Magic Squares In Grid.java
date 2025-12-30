// Title: Magic Squares In Grid
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/magic-squares-in-grid/

        }
            }
        for (int i=startI ; i<startI+3 ;  i++){
            for (int j=startJ ; j<startJ+3 ; j++){
                tot+=grid[i][j];
            }
        }
        int sum = grid[startI][startJ]+grid[startI+1][startJ+1]+grid[startI+2][startJ+2];
            int tot=0;
            if (tot!=sum) return false;
        if (sum!=grid[startI+2][startJ]+grid[startI+1][startJ+1]+grid[startI][startJ+2]) return false;
                if (grid[i][j]>9 || grid[i][j]==0 || set.contains(grid[i][j])) return false;
            for (int j=startJ ; j<startJ+3 ; j++){
        return cnt;
    }

    public boolean isMagic(int startI , int startJ ,  int[][] grid){
        for (int i=startI ; i<startI+3 ; i++){
            }
        }
        int cnt=0;
        for (int i=0 ; i<=grid.length-3 ; i++){
            for (int j=0 ; j<=grid[0].length-3 ; j++){
                if (isMagic(i,j,grid)) cnt++;
    public int numMagicSquaresInside(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
                set.add(grid[i][j]);
