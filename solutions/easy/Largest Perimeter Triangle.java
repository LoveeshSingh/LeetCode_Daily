// Title: Largest Perimeter Triangle
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/largest-perimeter-triangle/

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i=nums.length-1 ; i>=2 ; i--){
            if (nums[i]<nums[i-1]+nums[i-2]) return nums[i]+nums[i-1]+nums[i-2];
        }
    }
        return 0;
}
