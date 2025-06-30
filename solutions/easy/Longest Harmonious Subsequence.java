// Title: Longest Harmonious Subsequence
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/longest-harmonious-subsequence/

        int last=-1;
        int ans=0;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]!=last){
                if (cnt0>0) ans=Math.max(ans,cnt0+cnt1);
                if (nums[i]-last==1){
                    cnt0=cnt1;
                } 
                else{
                    cnt0=0;
                }
                cnt1=0;
            }
            cnt1++;
            last=nums[i];
        }
        if (cnt0>0) ans=Math.max(ans,cnt0+cnt1);
        return ans;
    }
        int cnt1=0;
        int cnt0=0;
        Arrays.sort(nums);
    public int findLHS(int[] nums) {
class Solution {