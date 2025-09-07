// Title: Find N Unique Integers Sum up to Zero
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int i=0;
        if (n%2!=0) ans[i++]=0; 
        for (; i<n ; i+=2){
            ans[i]=cntr;
        }
    }
        int cntr=-1;
            ans[i+1]=Math.abs(cntr);
            cntr--;
        return ans;
}
