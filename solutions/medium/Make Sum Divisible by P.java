// Title: Make Sum Divisible by P
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/make-sum-divisible-by-p/

        // Step 2: Use a hash map to track prefix sum mod p
        HashMap<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1); // To handle the case where the whole prefix is the answer
        int currentSum = 0;
        int minLen = n;

        // Step 3: Iterate over the array
        for (int i = 0; i < n; ++i) {
            currentSum = (currentSum + nums[i]) % p;

            // Calculate what we need to remove
            totalSum = (totalSum + num) % p;
        }

        int target = totalSum % p;
        if (target == 0) {
            return 0; // The array is already divisible by p
        }

        // Step 1: Calculate total sum and target remainder
        for (int num : nums) {

        int n = nums.length;
        int totalSum = 0;
    public int minSubarray(int[] nums, int p) {

class Solution {
