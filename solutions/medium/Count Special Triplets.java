// Title: Count Special Triplets
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-special-triplets/

class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Integer> preCnt = new HashMap<>();
        HashMap<Integer,Integer> postCnt = new HashMap<>();
        for (int i=0 ; i<nums.length-1 ; i++){
            preCnt.put(nums[i],preCnt.getOrDefault(nums[i],0)+1);
        }
        long ans=0;
        for (int i=nums.length-2 ; i>0 ; i--){
            postCnt.put(nums[i+1],postCnt.getOrDefault(nums[i+1],0)+1);
        }
    }
            preCnt.put(nums[i],preCnt.get(nums[i])-1);
            ans=(ans+((long)(preCnt.getOrDefault(nums[i]*2,0)))*postCnt.getOrDefault(nums[i]*2,0))%1000000007;
}
        return (int)ans;

