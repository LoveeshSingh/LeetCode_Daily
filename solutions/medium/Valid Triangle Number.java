// Title: Valid Triangle Number
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/valid-triangle-number/

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=nums.length-1 ; i>=2 ; i--){
            int max=nums[i];
            int j=0;
            int k=i-1;
        }
            while(j<k){
                if (nums[j]+nums[k]>max){
            }
                    ans+=k-j;
                }
                else{
                    j++;
                }
    }
        int ans=0;
                    k--;
        return ans;
}
