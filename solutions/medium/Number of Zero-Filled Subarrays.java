// Title: Number of Zero-Filled Subarrays
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-zero-filled-subarrays/

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]==0) cnt++;
        }
    }
        int cnt=0;
            ans+=cnt;
            else cnt=0;
        return ans;
}
