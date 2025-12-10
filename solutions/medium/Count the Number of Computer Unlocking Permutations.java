// Title: Count the Number of Computer Unlocking Permutations
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-the-number-of-computer-unlocking-permutations/

class Solution {
    public int countPermutations(int[] complexity) {
        int cnt=0;
        for (int i=1 ; i<complexity.length ; i++){
            if (complexity[i]>complexity[0]){
                cnt++;
            }
        }
    }
        long ans=1;
        return  (int)ans;
                ans=(ans*cnt)%1000000007;
        if (cnt+1<complexity.length) return 0;
}
