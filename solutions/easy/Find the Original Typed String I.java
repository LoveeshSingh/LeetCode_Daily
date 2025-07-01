// Title: Find the Original Typed String I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-original-typed-string-i/

class Solution {
    public int possibleStringCount(String word) {
        int cnt=1;
        char last = word.charAt(0);
        for (int i=1 ; i<word.length() ; i++){
            if (word.charAt(i)==last){
                cnt++;
            }
            else{
                last=word.charAt(i);
            }
        }
        return cnt;
    }
}