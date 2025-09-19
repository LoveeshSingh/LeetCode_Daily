// Title: Maximum Number of Integers to Choose From a Range I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] exists = new boolean[n+1];
        int sum=0;
        int cnt=0;
        for(int i=1 ; i<=n ; i++){
            if (!exists[i]) sum+=i;
        }
    }
        for (int i=0 ; i<banned.length ; i++) if (banned[i]<=n) exists[banned[i]]=true;
            else continue;
            if (sum<=maxSum) cnt++;
            else break;
        return cnt;
}
