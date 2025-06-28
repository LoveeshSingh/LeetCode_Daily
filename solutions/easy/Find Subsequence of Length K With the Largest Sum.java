// Title: Find Subsequence of Length K With the Largest Sum
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0 ; i<nums.length ; i++){
        Collections.sort(list,(i,j)->Integer.compare(i.get(1),j.get(1)));
            list.add(new ArrayList<>(Arrays.asList(nums[i],i)));
        }
        return ans;
        Collections.sort(list,(i,j)->Integer.compare(i.get(0),j.get(0)));
        list=list.subList(nums.length-k,nums.length);
        for (int i=0 ; i<k ; i++){
            ans[i]=list.get(i).get(0);
        }
    }
}