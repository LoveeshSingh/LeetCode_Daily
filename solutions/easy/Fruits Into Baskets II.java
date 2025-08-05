// Title: Fruits Into Baskets II
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/fruits-into-baskets-ii/

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt = baskets.length;
        for (int i=0 ; i<fruits.length ; i++){
            for (int j=0 ; j<baskets.length ; j++){
                if (baskets[j]>=fruits[i]){
                    baskets[j]=0;
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
    }
}