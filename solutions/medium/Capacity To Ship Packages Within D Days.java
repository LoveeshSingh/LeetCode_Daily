// Title: Capacity To Ship Packages Within D Days
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

            for (int i=0 ; i<weights.length ; i++){
                if (curr+weights[i]<=mid){
            }
                    curr+=weights[i];
                }
                else{
                    curr=weights[i];
                }
                    day++;
            if (day<=days){
                ans=Math.min(mid,ans);
            int day=1;
            int curr=0;
        }
        int ans=end;
        while(start<=end){
            int mid=(start+end)/2;
        for (int val : weights){
            start=Math.max(start,val);
            end+=val;
        int end=0;
        int start=1;
    public int shipWithinDays(int[] weights, int days) {
class Solution {