// Title: Count Covered Buildings
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-covered-buildings/

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] left = new int[n+1];
        int[] right = new int[n+1];
        int[] up = new int[n+1];
        int[] down = new int[n+1];
        for (int[] building : buildings){
            left[building[0]] = Math.min(building[1],left[building[0]]);
            right[building[0]] = Math.max(building[1],right[building[0]]);
            up[building[1]] = Math.min(building[0],up[building[1]]);
            down[building[1]] = Math.max(building[0],down[building[1]]);
        }
        int ans=0;
        for (int[] building : buildings){
            if (left[building[0]]<building[1] && right[building[0]]>building[1] && up[building[1]]
<building[0] && down[building[1]]>building[0]) ans++;
        }
        return ans;
        
    }
        Arrays.fill(right,-1);
        Arrays.fill(down,-1);
        Arrays.fill(left,Integer.MAX_VALUE);
        Arrays.fill(up,Integer.MAX_VALUE);
}
