// Title: Final Value of Variable After Performing Operations
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int minus = 0;
        int plus = 0;
        for (int i=0 ; i<operations.length ; i++){
            if (operations[i].charAt(1)=='-') minus++;
            else plus++;
        }
    }
        return plus-minus;
}
