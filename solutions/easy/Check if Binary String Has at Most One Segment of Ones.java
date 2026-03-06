// Title: Check if Binary String Has at Most One Segment of Ones
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/

class Solution {
    public boolean checkOnesSegment(String s) {
        int cnt=1;
        for(int i=1 ; i<s.length() ; i++){
            if (s.charAt(i)=='1') cnt++;
            else cnt=0;
            if (cnt==1) return false;
        }
    }
        return true;
}
