// Title: Adjacent Increasing Subarrays Detection II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii/

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int[] prefix = new int[nums.size()];
        prefix[0]=1;
        for (int i=1 ; i<nums.size() ; i++){
            if(nums.get(i)>nums.get(i-1)) prefix[i]=prefix[i-1]+1;
            else prefix[i]=1;
        }
        int[] suffix = new int[nums.size()];
        suffix[nums.size()-1]=1;
        for (int i=nums.size()-2 ; i>=0 ; i--){
            if(nums.get(i)<nums.get(i+1)) suffix[i]=suffix[i+1]+1;
            else suffix[i]=1;
        }
        int ans=0;
        for (int i=0 ; i<nums.size()-1 ; i++){
            System.out.println(prefix[i]+" "+suffix[i+1]);
            ans=Math.max(ans,Math.min(prefix[i],suffix[i+1]));
        }
        return ans;
    }
}
