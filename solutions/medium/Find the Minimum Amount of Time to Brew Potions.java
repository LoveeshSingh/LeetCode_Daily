// Title: Find the Minimum Amount of Time to Brew Potions
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-minimum-amount-of-time-to-brew-potions/

class Solution {
    public long minTime(int[] skill, int[] mana) {
        int wiz = skill.length;
        int potion = mana.length;
        long[][] dp = new long[potion][wiz];
        dp[0][0]=mana[0]*skill[0];
        for (int j=1 ; j<wiz ; j++){
            dp[0][j]= dp[0][j-1]+mana[0]*skill[j];
        }

        for (int i=1 ; i<potion ; i++){
            long max = 0;
            for(int j=0 ; j<wiz ; j++){
                max+= mana[i]*skill[j];
                max=Math.max(dp[i-1][j]+mana[i]*skill[j],max);
            }
            dp[i][wiz-1]=max;
            for (int j=wiz-2 ; j>=0 ; j--){
                dp[i][j]=dp[i][j+1]- mana[i]*skill[j+1];
            }
        }
        return dp[potion-1][wiz-1];
    }
}
