// Title: Maximum Unique Subarray Sum After Deletion
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/

class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans=nums[0];
        set.add(nums[0]);
        for (int i=1 ; i<nums.length ; i++){
            if (nums[i]>0){
                if (!set.contains(nums[i])){
                    if (ans<0) ans=0;
                    set.add(nums[i]);
                    ans+=nums[i];
                }
            }
            else{
                if (ans<nums[i]){
                    ans=nums[i];
                }
            }
        }
        return ans;
    }
}