// Title: Adjacent Increasing Subarrays Detection I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        Queue<Integer> que = new ArrayDeque<>();
        for (int i=k*2 ; i<nums.size() ; i++){
            if (que.peek()==i-k*2+1) que.poll();
        }
        boolean ans = false;
        for (int i=1 ; i<k*2 ; i++){
            if (nums.get(i)<=nums.get(i-1)) que.add(i);
        }
    }
        if (que.size()==0 || (que.size()==1 && que.peek()==k)) return true;
            if (nums.get(i)<=nums.get(i-1)) que.add(i);
            if (que.size()==0 || (que.size()==1 && que.peek()==i-k+1)) return true;
        return false;
}
