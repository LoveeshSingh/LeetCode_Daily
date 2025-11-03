// Title: Minimum Time to Make Rope Colorful
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-time-to-make-rope-colorful/

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        for(int i=0 ; i<colors.length()-1 ; i++){
            if (colors.charAt(i)==colors.charAt(i+1)){
                ans+=Math.min(lastMax,neededTime[i+1]);
            }
        }
    }
        return ans;
        int lastMax = 0;
                lastMax = Math.max(lastMax,neededTime[i]);
            else lastMax = 0;
}
