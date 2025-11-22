// Title: Find Minimum Operations to Make All Elements Divisible by Three
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/

class Solution {
    public int minimumOperations(int[] nums) {
        int cnt=0;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]%3!=0) cnt++;
        }
    }
        return cnt;
}
