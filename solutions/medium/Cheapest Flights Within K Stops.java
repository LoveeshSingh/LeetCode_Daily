// Title: Cheapest Flights Within K Stops
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/cheapest-flights-within-k-stops/

·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(node==dst)·‌return·‌cost;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(cnt==k)·‌continue;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌for(List<Integer>·‌to·‌:·‌adj.get(node)){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌pq.add(new·‌int[]{to.get(0),cost+to.get(1),cnt+1});
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌return·‌-1;
·‌·‌·‌·‌}

·‌·‌·‌·‌public·‌List<List<List<Integer>>>·‌adjacency(int[][]·‌edges·‌,·‌int·‌n){
·‌·‌·‌·‌·‌·‌·‌·‌List<List<List<Integer>>>·‌ans·‌=·‌new·‌ArrayList<>();
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i=0·‌;·‌i<n·‌;·‌i++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌ans.add(new·‌ArrayList<>());
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int[]·‌edge·‌:·‌edges){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌from·‌=·‌edge[0];
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌to·‌=·‌edge[1];
·‌·‌·‌·‌·‌·‌·‌·‌pq.add(new·‌int[]{src,0,0});
·‌·‌·‌·‌·‌·‌·‌·‌while(!pq.isEmpty()){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌node·‌=·‌pq.peek()[0];
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌cost·‌=·‌pq.peek()[1];
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌cnt·‌=·‌pq.poll()[2];
class·‌Solution·‌{
·‌·‌·‌·‌public·‌int·‌findCheapestPrice(int·‌n,·‌int[][]·‌flights,·‌int·‌src,·‌int·‌dst,·‌int·‌k)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌List<List<List<Integer>>>·‌adj·‌=·‌adjacency(flights,n);
·‌·‌·‌·‌·‌·‌·‌·‌Queue<int[]>·‌pq·‌=·‌new·‌PriorityQueue<>((i,j)->(i[1]-j[1]));
·‌·‌·‌·‌·‌·‌·‌·‌k++;
