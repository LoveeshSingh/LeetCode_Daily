// Title: Find the Smallest Divisor Given a Threshold
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left =1;
        int right=1000000;
        while(left<=right){
            int mid = (left+right)/2;
        }
            for (int i=0 ; i<nums.length ; i++){
                cnt+=Math.ceil((double)nums[i]/mid);
            }
            long cnt=0;
            if (cnt<=threshold){
                ans=Math.min(ans,mid);
            }
            else{
                left=mid+1;
    }
        int ans = right;
                right=mid-1;
        return ans;
            }
}