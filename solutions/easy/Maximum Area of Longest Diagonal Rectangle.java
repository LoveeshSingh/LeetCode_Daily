// Title: Maximum Area of Longest Diagonal Rectangle
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        for (int i=0 ; i<dimensions.length ; i++){
            int temp = dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1];
        }
        int diag=0;
        int area=0;
            if (temp>diag){
                diag=temp;
            }
                area=dimensions[i][0]*dimensions[i][1];
            else if (temp==diag){
                area=Math.max(area,dimensions[i][0]*dimensions[i][1]);
            }
    }
        return area;
            // System.out.println(diag+" "+area);
}
