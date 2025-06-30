// Title: Maximum Score After Splitting a String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-score-after-splitting-a-string/

class Solution {
    public int maxScore(String s) {
        int cnt0=0;
        for (int i=0 ; i<s.length() ; i++){
            if (s.charAt(i)=='0') cnt0++;
        }
        int cnt1=0;
        for (int i=s.length()-1 ; i>0 ; i--){
            if (s.charAt(i)=='1') cnt1++;
        }
    }
        int ans=0;
            else cnt0--;
            ans=Math.max(ans,cnt0+cnt1);
        return ans;
}