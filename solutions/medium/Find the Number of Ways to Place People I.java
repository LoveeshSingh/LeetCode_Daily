// Title: Find the Number of Ways to Place People I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-number-of-ways-to-place-people-i/

class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points,(i,j)->((i[0]!=j[0])?Integer.compare(i[0],j[0]):Integer.compare(j[1],i[1])));
        for (int i=0; i<points.length ; i++){
            for (int j=i-1 ; j>=0 ; j--){
        }
                if (points[j][1]<low && points[j][1]>=points[i][1]){
            }
            int low=Integer.MAX_VALUE;
                    cnt++;
                }
    }
        int cnt=0;
                    low=points[j][1];
        return cnt;
}
