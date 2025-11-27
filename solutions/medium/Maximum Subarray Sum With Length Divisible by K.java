// Title: Maximum Subarray Sum With Length Divisible by K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray-sum-with-length-divisible-by-k/

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n= nums.length;
        long[] presum = new long[n+1];
        for (int i=0 ; i<n ; i++) presum[i+1]=presum[i]+nums[i];
        for (int i=0 ; i<k ; i++){
            for (int j=i+k ; j<=n ; j+=k){
        }
                sum+=presum[j]-presum[j-k];
            }
    }
            long sum = 0;
        long ans = Long.MIN_VALUE;
                ans = Math.max(ans,sum);
                if (sum<0) sum=0;
        return ans;
}
