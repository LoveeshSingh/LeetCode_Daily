// Title: Make Array Elements Equal to Zero
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/make-array-elements-equal-to-zero/

class Solution {
    public int countValidSelections(int[] nums) {
        int right = 0;
        for (int i=0 ; i<nums.length ; i++){
            right+=nums[i];
        }
        int left = 0;
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]==0){
        }
                if (left==right) ans+=2;
            }
            else{
                left+=nums[i];
            }
    }
                right-=nums[i];
        int ans=0;
                else if (Math.abs(left-right)==1) ans+=1;
        return ans;
}
