// Title: Longest Binary Subsequence Less Than or Equal to K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k/

class Solution {
    public int longestSubsequence(String s, int k){
        int num=0;
        int ans=0;
        for (int i=s.length()-1 ; i>=0 ; i--){
            if (s.charAt(i)=='0') ans++;
            else{
                int mltpl = 1 << ans;
                if (num+mltpl>k) continue;
                num+=mltpl;
                ans++;
            }
        }
        return ans;
    }
                if (ans>=31) continue;
}