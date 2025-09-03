// Title: Longest Well-Performing Interval
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-well-performing-interval/

class Solution {
    public int longestWPI(int[] hours) {
        int[] prefix = new int[hours.length+1];
        for (int i=0 ; i<hours.length ; i++){
            prefix[i+1]=prefix[i]+((hours[i]>8)?1:-1);
        }
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
            if (prefix[i+1]>0) ans=i+1;
            else{
                if (map.containsKey(prefix[i+1]-1)) ans=Math.max(ans,i-map.get(prefix[i+1]-1));
            }
    }
                if (!map.containsKey(prefix[i+1])) map.put(prefix[i+1],i);
        return ans;
}
