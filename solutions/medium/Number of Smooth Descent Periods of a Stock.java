// Title: Number of Smooth Descent Periods of a Stock
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/

class Solution {
    public long getDescentPeriods(int[] prices) {
        int last=0;
        long ans=1;
        for (int i=1 ; i<prices.length ; i++){
            if (prices[i-1]-prices[i]!=1){
                last=i;
            }
        }
    }
            ans+=i-last+1;
        return ans;
}
