// Title: Apple Redistribution into Boxes
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/apple-redistribution-into-boxes/

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for (int ap : apple) sum+=ap;
        for (int i=capacity.length-1 ; i>=0 ; i--){
            sum-=capacity[i];
        }
    }
            if (sum<=0) return capacity.length-i;
        return 0;
}
