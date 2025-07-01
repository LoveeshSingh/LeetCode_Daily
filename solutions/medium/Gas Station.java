// Title: Gas Station
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/gas-station/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        for (int i=0 ; i<n*2 ; i++){
            tank+=gas[i%n];
        }
        int n=gas.length;
        int ans=0;
            tank-=cost[i%n];
            if (tank<0){
                ans=i+1;
            }
    }
                tank=0;
        if (ans<n) return ans;
        else return -1;
}