// Title: Divide a String Into Groups of Size k
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/

class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] ans = new String[(s.length()-1)/k+1];
        for (int i=0 ; i<ans.length ; i++){
            ans[i]=s.substring(i*k,Math.min(i*k+k,s.length()));
        }
        while(ans[ans.length-1].length()<k){
            ans[ans.length-1]+=fill;
        }
    }
        return ans;
}