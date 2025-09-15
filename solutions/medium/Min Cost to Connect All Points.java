// Title: Min Cost to Connect All Points
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/min-cost-to-connect-all-points/


class Solution {
    public int minCostConnectPoints(int[][] points) {
        DSU dsu = new DSU(points.length);
        List<List<Integer>> edges = new ArrayList<>();
        for (int i=0 ; i<points.length ; i++){
            for (int j=i+1 ; j<points.length ; j++){
                edges.add(new ArrayList<>(Arrays.asList((Math.abs(points[i][0]
-points[j][0])+Math.abs(points[i][1]-points[j][1])),i,j)));
            }
        }
        Collections.sort(edges,(i,j)->Integer.compare(i.get(0),j.get(0)));
        int cost=0;
        for (List<Integer> edge : edges){
            if (dsu.union(edge.get(1),edge.get(2))){
                cost+=edge.get(0);
            }
        }
        return cost;
    }
}
