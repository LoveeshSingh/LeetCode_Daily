// Title: Count Unique Characters of All Substrings of a Given String
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/

class Solution {
    public int uniqueLetterString(String s) {
        Arrays.fill(last,-1);
        for (int i=0 ; i<s.length() ; i++){
            last[s.charAt(i)-'A']=i;
        }
    }
        int[] last = new int[26];
        int[] gap = new int[26];
            gap[indx]=i-last[indx];
            int indx = s.charAt(i)-'A';
            for (int j=0 ; j<26 ; j++) ans+=gap[j];
        int ans=0;
        return ans;
}
