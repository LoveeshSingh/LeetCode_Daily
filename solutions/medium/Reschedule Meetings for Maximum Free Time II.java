// Title: Reschedule Meetings for Maximum Free Time II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-ii/

        }
        int max = 0;
        spaces[start.length]=event-end[end.length-1];
        for (int i=0 ; i<start.length ; i++){
            if (max>=end[i]-start[i]){
        }
                ans=Math.max(ans,spaces[i]+spaces[i+1]+end[i]-start[i]);
            }
        int ans=0;
            max=Math.max(max,spaces[i]);
        max=0;
        for (int i=start.length-1 ; i>=0 ; i--){
            if (max>=end[i]-start[i]){
                ans=Math.max(ans,spaces[i]+spaces[i+1]+end[i]-start[i]);
            }
            max=Math.max(max,spaces[i+1]);
        }
            spaces[i+1]=start[i+1]-end[i];
        for (int i=0 ; i<start.length-1 ; i++){
        spaces[0]=start[0]-0;
        int[] spaces = new int[start.length+1];
    public int maxFreeTime(int event, int[] start, int[] end) {
class Solution {