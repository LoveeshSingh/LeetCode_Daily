// Title: House Robber II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/house-robber-ii/

class Solution {
    public int rob(int[] nums) {
        return Math.max(robLimited(nums,0,nums.length-2),robLimited(nums,1,nums.length-1));
    }

    public int robLimited(int[] nums , int i , int j){
        int val1=nums[i];
        int val2=nums[i+1];
        if (j<=i) return nums[i];
        for (i=i+2 ; i<=j ; i++){
        }
    }
        return Math.max(val1,val2);
        if (nums.length==1) return nums[0];
            int temp=val1;
            val1=Math.max(val1,val2);
            val2=temp+nums[i];
}