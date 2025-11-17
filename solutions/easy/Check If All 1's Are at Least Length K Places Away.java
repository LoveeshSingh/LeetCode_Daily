// Title: Check If All 1's Are at Least Length K Places Away
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-if-all-1's-are-at-least-length-k-places-away/

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last = -nums.length-5;
        int ans = Integer.MAX_VALUE;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]==1){
        }
                ans = Math.min(ans,i-last-1);
            }
    }
                last = i;
        return ans>=k;
}
