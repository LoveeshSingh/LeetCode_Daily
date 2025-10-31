// Title: The Two Sneaky Numbers of Digitville
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int indx=0;
        for (int i=0 ; i<nums.length ; i++){
            if (set.contains(nums[i])) ans[indx++]=nums[i];
        }
    }
            else set.add(nums[i]);
        return ans;
}
