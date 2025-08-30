// Title: Valid Sudoku
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/valid-sudoku/

        return true;
    }

            }
        }
                    if (board[k][l]=='.') continue;
                    if (set.contains(board[k][l])) return false;
                    set.add(board[k][l]);
                }
                for (int l=j; l<endj ; l++){
            int endj=j+3;
            HashSet<Character> set = new HashSet<>();
            for (int k=i; k<endi ; k++){
            int endi=i+3;
            int j=(box%3)*3;
            int i=(box/3)*3;
        for (int box=0 ; box<9 ; box++){
    public boolean checkSubBoxes(char[][] board){
    }

        return false;
    public boolean isValidSudoku(char[][] board) {
        if (checkSubBoxes(board) && checkHorizon(board) && checkVertical(board)) return true;
class Solution {
