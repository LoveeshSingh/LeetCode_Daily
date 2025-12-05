// Title: Count Partitions with Even Sum Difference
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/count-partitions-with-even-sum-difference/

class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for (int i=0 ; i<nums.length ; i++){
            total+=nums[i];
        }
        int sum=0;
        int cnt=0;
        for (int i=0 ; i<nums.length-1 ; i++){
            sum+=nums[i];
            total-=nums[i];
            if ((sum-total)%2==0) cnt++;
        }
        return cnt;
    }
}
