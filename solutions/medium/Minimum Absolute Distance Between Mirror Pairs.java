// Title: Minimum Absolute Distance Between Mirror Pairs
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/

class Solution {
    public long reverse(int val){
        long ans = 0;
        StringBuilder sb = new StringBuilder(Integer.toString(val));
        sb.reverse();
        ans = Long.parseLong(sb.toString());
        return ans;
    }
    
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Long,Integer> latest = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i=0 ; i<nums.length ; i++){
            long val= reverse(nums[i]);
            if (latest.containsKey((long)nums[i])) ans=Math.min(ans,i-latest.get((long)
nums[i]));
            latest.put(val,i);
        }
        if (ans==Integer.MAX_VALUE) return -1;
        return ans;        
    }
}
