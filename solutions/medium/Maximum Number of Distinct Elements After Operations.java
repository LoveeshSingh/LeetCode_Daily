// Title: Maximum Number of Distinct Elements After Operations
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-number-of-distinct-elements-after-operations/

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int curr = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            if(curr>=nums[i]+k) continue;
        }
    }
            ans++;
            curr=Math.max(curr+1,nums[i]-k);
        return ans;
}
