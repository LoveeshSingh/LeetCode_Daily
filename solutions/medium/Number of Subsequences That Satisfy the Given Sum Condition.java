// Title: Number of Subsequences That Satisfy the Given Sum Condition
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        int left = 0 , right = n - 1 , result = 0;

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                result = (result + power[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
        Arrays.sort(nums);
        
        int[] power = new int[n];
        power[0] = 1;
class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007 , n = nums.length;