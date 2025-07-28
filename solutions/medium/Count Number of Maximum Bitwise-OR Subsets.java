// Title: Count Number of Maximum Bitwise-OR Subsets
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/

class Solution {
    public int countMaxOrSubsets(int[] nums) {

        int n = nums.length, maxOr = 0, count = 0;
                if ((mask & (1 << i)) != 0) or |= nums[i];
        for (int num : nums) maxOr |= num;

        int total = 1 << n;
        for (int mask = 1; mask < total; mask++) {
            if (or == maxOr) count++;
            for (int i = 0; i < n; i++) {
            }
            int or = 0;
        }

        return count;
    }
}
