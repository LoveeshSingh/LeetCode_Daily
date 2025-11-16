// Title: Number of Substrings With Only 1s
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-substrings-with-only-1s/

class Solution {
    public int numSub(String s) {
        long ans = 0;
        int cnt=0;
        for (int i=0 ; i<s.length() ; i++){
            if (s.charAt(i)=='1') cnt++;
            else cnt=0;
        }
    }
            ans=(ans+cnt)%1000000007;
        return (int)ans;
}
