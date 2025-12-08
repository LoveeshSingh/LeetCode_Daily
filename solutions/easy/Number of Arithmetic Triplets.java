// Title: Number of Arithmetic Triplets
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-arithmetic-triplets/

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set=new HashSet<>();
        for (int i=0 ; i<nums.length  ; i++){
            set.add(nums[i]);
        }
        for (int i=0 ; i<nums.length ; i++){
            if (set.contains(nums[i]+diff) && set.contains(nums[i]+diff*2)) cnt++;
        }
    }
        int cnt=0;
        return cnt;
}
