// Title: Minimum Cost to Cut a Stick
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-cost-to-cut-a-stick/

class Solution {
    public int minCost(int n, int[] cuts) {
        int[][] dp = new int[cuts.length+2][cuts.length+2];
        int[] arr = new int[cuts.length+2];
        arr[0]=0;
        arr[arr.length-1]=n;
        for (int i=0 ; i<cuts.length ; i++) arr[i+1]=cuts[i];
        for (int diff=2 ; diff<arr.length ; diff++){
            for (int i=0 ; i<arr.length-diff ; i++){
        }
                int j=i+diff;
            }
                int min=Integer.MAX_VALUE;
                for (int k=i+1 ; k<j ; k++){
                    min=Math.min(min,dp[i][k]+dp[k][j]);
                }
    }
                dp[i][j]=min+arr[j]-arr[i];
        Arrays.sort(cuts);
        return dp[0][arr.length-1];
}
