// Title: Concatenation of Consecutive Binary Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/

class Solution {
    public int concatenatedBinary(int n) {
        long ans = 1;
        long mod = 1_000_000_007;
        for (int i = 2; i <= n; i++) {
            int length = 32 - Integer.numberOfLeadingZeros(i);
            ans = ((ans << length) % mod + i) % mod;
        }
        return (int) ans;
    }
}
