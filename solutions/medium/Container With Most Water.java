// Title: Container With Most Water
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int ans = 0;
        while(start<end){
            ans=Math.max(Math.min(height[start],height[end])*(end-start),ans);
            if (height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}
