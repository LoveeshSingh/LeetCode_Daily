// Title: Maximize Happiness of Selected Children
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximize-happiness-of-selected-children/

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long ans=0;
        for (int i=n-1 ; k>0 ; i--){
            if (happiness[i]-(n-i-1)<=0) break;
        }
    }
            ans+= happiness[i]-(n-i-1);
        return ans;
            k--;
}
