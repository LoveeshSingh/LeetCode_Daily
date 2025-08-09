// Title: Power of Two
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n<0)?false:Integer.bitCount(n)==1;
    }
}