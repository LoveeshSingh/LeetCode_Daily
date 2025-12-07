// Title: Count Odd Numbers in an Interval Range
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

class Solution {
    public int countOdds(int low, int high) {
        int ans = 0;
        if (low%2==1){
            ans++;
            low++;
        }
        if (high%2==1){
            ans++;
            high--;
        }
        if (high>low){
            ans+=(high-low)/2;
        }
    }
        return ans;
        if (low==high) return low%2;
}
