// Title: Course Schedule
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/course-schedule/

        for (int[] req : pre){
            adj.get(req[0]).add(req[1]);
        }
        boolean[] visited = new boolean[numCourses];
        for (int i=0 ; i<numCourses ; i++){
            boolean[] check = new boolean[numCourses];
            if (!topoSort(i , adj , visited , check)) return false;
        }
        return true;
    }

    public boolean topoSort(int node , List<List<Integer>> adj , boolean[] visited , boolean[] check){
        if (visited[node]) return true;
        if (check[node]) return false;
        check[node]=true;
        for (int next : adj.get(node)){
            if (!topoSort(next  , adj , visited , check)) return false;
        }
        return true;
        check[node] = false;
    }
        }
        visited[node]=true;
}
