// Title: Subarray Sum Equals K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-sum-equals-k/

        HashMap<Integer,Integer> map = new HashMap<>();
    public int subarraySum(int[] nums, int k) {
class Solution {
        int sum=0;
        for (int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
        }
    }
            if (map.containsKey(sum-k)) ans+=map.get(sum-k);
        int ans=0;
            map.put(sum,map.getOrDefault(sum,0)+1);
        return ans;
        map.put(0,1);
}