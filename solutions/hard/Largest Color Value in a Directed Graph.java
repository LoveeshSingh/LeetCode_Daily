// Title: Largest Color Value in a Directed Graph
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/largest-color-value-in-a-directed-graph/

·‌·‌·‌·‌·‌·‌·‌·‌return·‌max;
·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i·‌:·‌adj.get(node)){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌j=0·‌;·‌j<26·‌;·‌j++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌cnt[i][j]=Math.max(cnt[i][j],cnt[node][j]);
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌}
        if (sorted.size()<nodes) return -1;
        return maxColor(sorted,adj,colors,nodes);
    }

    public·‌int·‌maxColor(List<Integer>·‌sorted·‌,·‌List<List<Integer>>·‌adj·‌,·‌String·‌colors·‌,·‌int·‌nodes){
·‌·‌·‌·‌·‌·‌·‌·‌int[][]·‌cnt·‌=·‌new·‌int[nodes][26];
·‌·‌·‌·‌·‌·‌·‌·‌int·‌max=1;
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌node·‌:·‌sorted){

    public List<List<Integer>> adjacencyList(int[][] edges , int nodes){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌cnt[node][color]++;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌max=Math.max(cnt[node][color],max);
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌color·‌=·‌colors.charAt(node)-'a';
        List<List<Integer>> adj = adjacencyList(edges,nodes);
        List<Integer> sorted = topologicalSort(nodes,adj,edges);
        int nodes = colors.length();
        List<List<Integer>> ans = new ArrayList<>();
