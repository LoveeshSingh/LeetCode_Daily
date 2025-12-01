// Title: Maximum Running Time of N Computers
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-running-time-of-n-computers/

        Arrays.sort(batteries);
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i=batteries.length-1 ; pq.size()<n ; i--){
            pq.add((long)batteries[i]);
        }
        for (int i=batteries.length-n-1 ; i>=0 ; i--){
        }
        long extra=0;
            extra+=batteries[i];
        while(!pq.isEmpty() && extra>0){
        long last = pq.poll();
        }
            extra-=req;
            last=val;
        last+=extra/(n-pq.size());
    }
            long req = (val-last)*(n-pq.size());
            if (req>extra) break;
            long val = pq.peek();
            pq.poll();
    public long maxRunTime(int n, int[] batteries) {
        return last;
class Solution {
        // System.out.println(last+ " " + extra + " " + pq.size());
}
