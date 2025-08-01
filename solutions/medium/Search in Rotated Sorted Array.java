// Title: Search in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

            else if (target>nums[mid]){
            int mid=(start+end)/2;
                start=mid+1;
            }
            else{
            }
                if (nums[start]>nums[mid]){
                    end=mid-1;
                }
                else{
                    if (target>=nums[start]){
                }
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
            if (target==nums[mid]) return mid;
        }
        while(start<=end){
        int end=nums.length-1;
        int start=0;
    public int search(int[] nums, int target) {
class Solution {
                