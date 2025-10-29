// Title: Smallest Number With All Set Bits
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-number-with-all-set-bits/

class Solution {
    public int smallestNumber(int n) {
        int ans = 1;
        while(ans<n){
            ans<<=1;
            ans+=1;
        }
        return ans;
    }
}
