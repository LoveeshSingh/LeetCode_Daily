// Title: Count Number of Trapezoids I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-number-of-trapezoids-i/

    public int countTrapezoids(int[][] points) {
        Arrays.sort(points,(i,j)->Integer.compare(i[1],j[1]));
        for (int i=0 ; i<points.length ; i++){
            if (points[i][1]==last){
        }
                curr++;
            }
            else{
                ans= (ans+(cnt*tot)%MOD)%MOD;
            }
    }
        long curr=0;
        long ans=0;
                long cnt = (curr*(curr-1)/2)%MOD;
                tot=(tot+cnt)%MOD;
                curr=1L;
                last=points[i][1];
        ans=(ans+((((((long)curr)*(curr-1)/2))%MOD)*tot)%MOD)%MOD;
        return (int)ans;
    final int MOD = 1000000007;
        int last=points[0][1];
        long tot=0;
}
class Solution {
