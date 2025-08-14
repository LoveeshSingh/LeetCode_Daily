// Title: Largest 3-Same-Digit Number in String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/largest-3-same-digit-number-in-string/

class Solution {
    public String largestGoodInteger(String num) {
        char last = 'q';
        int cnt = 0;
        int ans = -1;
        for (int i = 0; i < num.length(); i++){
            if (num.charAt(i) == last)
                cnt++;
            else {
                last = num.charAt(i);
                cnt = 1;
            }
            if (cnt == 3)
                ans = Math.max(ans, last - '0');
        }
        if (ans == -1) return "";
        return "" + ans + ans + ans;
    }
}