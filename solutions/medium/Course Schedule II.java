// Title: Course Schedule II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/course-schedule-ii/

    }

    public List<List<Integer>> adjacencyList(int[][] edges , int n){
        for(int[] edge : edges){
        List<List<Integer>> ans = new ArrayList<>();
            ans.get(edge[1]).add(edge[0]);
        }
        for(int i=0 ; i<n ; i++){
            ans.add(new ArrayList<>());
        }
        return ans;
        }
        int[] ans = new int[numCourses];
        for (int i=numCourses-1 ; i>=0 ; i--) ans[numCourses-i-1]=topoSort.get(i);
        return ans;
        for (int i=0 ; i<numCourses ; i++){
            if (!dfs(new boolean[numCourses] , i , adj , topoSort)) return new int[]{};
        // }
        // int[] inDegree = new int[numCourses];
        // for(int[] pre : prerequisites){
        //     inDegree[pre[0]]++;
        globalVisited = new boolean[numCourses];
        List<Integer> topoSort = new ArrayList<>();
        List<List<Integer>> adj = adjacencyList(prerequisites,numCourses);
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    boolean[] globalVisited;
class Solution {
