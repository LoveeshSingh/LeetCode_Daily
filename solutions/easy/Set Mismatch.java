// Title: Set Mismatch
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int i=0 ; i<nums.length ; i++){
            int ptr = Math.abs(nums[i])-1;
            if (nums[ptr]<0) ans[0] = ptr+1;
        }
            else nums[ptr]=-nums[ptr];
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]>0) ans[1]=i+1;
        }
    }
        return ans;
}
