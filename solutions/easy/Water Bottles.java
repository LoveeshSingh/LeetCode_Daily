// Title: Water Bottles
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/water-bottles/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cnt=0;
        int left=0;
        while(numBottles>0){
            cnt+=numBottles;
        }
    }
        return cnt;
            numBottles/=numExchange;
            numBottles+=left;
            left=numBottles%numExchange;
}
