// Title: Car Fleet
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/car-fleet/

    public int carFleet(int target, int[] position, int[] speed) {
        int[][] sorted = new int[position.length][2];
        Arrays.sort(sorted,(i,j)->Integer.compare(j[0],i[0]));
        for (int i=0 ; i<sorted.length ; i++){
            sorted[i][0]=position[i];
        }
            sorted[i][1]=speed[i];
        double time1=((target-sorted[0][0])*1.0)/sorted[0][1];
        for (int i=1 ; i<sorted.length ; i++){
            int p2 = sorted[i][0];
            if (time1<time2){
                cnt++;
        int cnt=1;
            int s2 = sorted[i][1];
            double time2 = ((target-p2)*1.0)/s2;
            }
        }
        return cnt;
    }
                time1=time2;
}
class Solution {
