// Title: Minimum Number of Operations to Make All Array Elements Equal to 1
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-number-of-operations-to-make-all-array-elements-equal-to-1/

        int g = nums[0];
        if (g != 1) return -1;
        int ones = 0;
        for (int x : nums) g = gcd(g, x);
        for (int x : nums) if (x == 1) ones++;
        if (ones > 0) return n - ones;
        int best = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            for (int j = i + 1; j < n; j++) {
                curr = gcd(curr, nums[j]);
                if (curr == 1) {
                    best = Math.min(best, j - i);
                    break;
                }
        int n = nums.length;
    public int minOperations(int[] nums) {

            }
        }
        return best + n - 1;
    }
        return gcd(b, a % b);
    }
class Solution {
    public int gcd(int a, int b) {
        if (b == 0) return a;
