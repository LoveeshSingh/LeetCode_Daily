// Title: Largest Rectangle in Histogram
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/largest-rectangle-in-histogram/

            while(j>=0){
        } 
                if (heights[j]>=heights[i]){
            }
                    j-=left[j]+1;
                }
                else break;
        for (int i=n-2 ; i>=0 ; i--){
            left[i]=i-j-1;
            int j=i+1;
            while(j<n){
                if (heights[j]>=heights[i]){
                    j+=right[j]+1;
                }
                else break;
            }
            right[i]=j-i-1;
            int j=i-1;
        for (int i=1 ; i<n ; i++){
        int n = heights.length;
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
class Solution {
    public int largestRectangleArea(int[] heights) {
