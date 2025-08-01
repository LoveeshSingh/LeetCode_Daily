// Title: Find Minimum in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid = (start+end)/2;
        }
            ans=Math.min(ans,nums[mid]);
            if (nums[mid]<nums[end]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
    }
        return ans;
}