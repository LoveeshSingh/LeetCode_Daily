// Title: Minimum Distance Between Three Equal Elements II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/

class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,Queue<Integer>> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i=0 ; i<nums.length ; i++){
            if (map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
                if (map.get(nums[i]).size()>2){
                    ans = Math.min(ans,(i-map.get(nums[i]).poll())*2);
                }
            }
            else{
                Queue<Integer> que = new ArrayDeque<>();
                que.add(i);
                map.put(nums[i],que);
            }
        }
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
