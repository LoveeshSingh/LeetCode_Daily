// Title: Longest Consecutive Sequence
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int val : nums) map.put(val,1);
        for (int value : nums){
            while(map.containsKey(val)){
        }

            int cnt=0;
                cnt+=map.get(val);
            }
    }
        int max = 0;
                val++;
            map.put(value,cnt);
                map.remove(val);
            max = Math.max(max,cnt);
        return max;
            int val = value;
                if (map.get(val)<0) break;
}
