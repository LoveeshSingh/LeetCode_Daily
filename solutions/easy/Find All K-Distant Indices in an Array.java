// Title: Find All K-Distant Indices in an Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]==key) list.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0 ; i<nums.length ; i++){
            if (Math.abs(list.get(0)-i)<=k) ans.add(i);
        }
    }
            if (list.size()==0) break;
            if (i-list.get(0)==k) list.remove(0); 
        return ans;
}