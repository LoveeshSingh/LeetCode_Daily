// Title: Convert Integer to the Sum of Two No-Zero Integers
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/

class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i=1 ; i<=n/2 ; i++){
            if (!Integer.toString(i).contains("0") && !Integer.toString(n-i).contains("0")){
                return new int[]{i,n-i};
            }
        }
        return new int[2];
    }
}
