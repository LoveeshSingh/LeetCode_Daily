// Title: Sudoku Solver
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/sudoku-solver/

        if (board[i][j]=='.'){
        if (j==9) return dfs(board,i+1,0);
            for (int k=0 ; k<9 ; k++){
                if (!sub[(i/3)*3+j/3][k] && !row[i][k] && !col[j][k]){
                    board[i][j]=(char)('0'+k+1);
        if (i==9) return true;
    public boolean dfs(char[][] board , int i , int j){
    
        dfs(board,0,0);
    }
            }
        }
                    col[j][board[i][j]-'1']=true;
                }
                    row[i][board[i][j]-'1']=true;
                    sub[(i/3)*3+j/3][board[i][j]-'1']=true;
                if (board[i][j]!='.'){
            for(int j=0 ; j<9 ; j++){
        for (int i=0 ; i<9 ; i++){
    public void solveSudoku(char[][] board) {
    boolean[][] col = new boolean[9][9];
    boolean[][] row = new boolean[9][9];
    boolean[][] sub = new boolean[9][9];
class Solution {
