// Title: Number of Laser Beams in a Bank
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int n = bank.length;
        int last = 0;
        for (int i=0 ; i<n ; i++){
            int cnt = 0;
        }
    }
            for (char c : bank[i].toCharArray()) if (c=='1') cnt++;
            if (cnt==0) continue;
            ans+=last*cnt;
            last = cnt;
        return ans;
}
