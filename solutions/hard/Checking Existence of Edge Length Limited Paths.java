// Title: Checking Existence of Edge Length Limited Paths
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths/

·‌·‌·‌·‌·‌·‌·‌·‌int[][]·‌sortedQueries·‌=·‌new·‌int[queries.length][queries[0].length+1];
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i=0·‌;·‌i<queries.length·‌;·‌i++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌sortedQueries[i]·‌=·‌new·‌int[]{queries[i][0],queries[i][1],queries[i][2],i};
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌Arrays.sort(sortedQueries,(i,j)->Integer.compare(i[2],j[2]));
·‌·‌·‌·‌·‌·‌·‌·‌Arrays.sort(edgeList,(i,j)->Integer.compare(i[2],j[2]));
·‌·‌·‌·‌·‌·‌·‌·‌boolean[]·‌ans·‌=·‌new·‌boolean[queries.length];
·‌·‌·‌·‌·‌·‌·‌·‌int·‌ptr=0;
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i=0·‌;·‌i<sortedQueries.length·‌;·‌i++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌from·‌=·‌sortedQueries[i][0];
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌to·‌=·‌sortedQueries[i][1];
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌max·‌=·‌sortedQueries[i][2];
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌indx·‌=·‌sortedQueries[i][3];
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌while(ptr<edgeList.length·‌&&·‌edgeList[ptr][2]<max){
        }
·‌·‌·‌·‌·‌·‌·‌·‌else{
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌parent[v]=u;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌size[u]+=size[v];·‌
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌return·‌true;
·‌·‌·‌·‌}
}

class·‌Solution·‌{
·‌·‌·‌·‌public·‌boolean[]·‌distanceLimitedPathsExist(int·‌n,·‌int[][]·‌edgeList,·‌int[][]·‌queries)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌DSU·‌dsu·‌=·‌new·‌DSU(n);

