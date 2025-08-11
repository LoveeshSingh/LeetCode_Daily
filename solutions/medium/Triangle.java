// Title: Triangle
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/triangle/

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i=1 ; i<n ; i++){
        int n = triangle.size();
            triangle.get(i).set(0,triangle.get(i).get(0)+triangle.get(i-1).get(0));
        }
            triangle.get(i).set(i,triangle.get(i).get(i)+triangle.get(i-1).get(i-1));
        for (int i=2 ; i<n ; i++){
            for (int j=1 ; j<i ; j++){
        }
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i-1).get(j-1),triangle.get(i-1).get(j)));
            }
        int ans=Integer.MAX_VALUE;
        for (int j=0 ; j<n ; j++){

        }
    }
            ans=Math.min(ans,triangle.get(n-1).get(j));
        return ans;
}