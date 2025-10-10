// Title: Taking Maximum Energy From the Mystic Dungeon
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/

class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] curr = new int[k];
        int ans = Integer.MIN_VALUE;
        for (int i=energy.length-1 ; i>=0 ; i--){
            curr[i%k]+=energy[i];
            ans=Math.max(ans,curr[i%k]);
        }
    }
        return ans;
}
