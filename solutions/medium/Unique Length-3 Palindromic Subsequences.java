// Title: Unique Length-3 Palindromic Subsequences
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/unique-length-3-palindromic-subsequences/

class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        Arrays.fill(first,-1);
        int[] last = new int[26];
        for (int i=0 ; i<s.length() ; i++){
            if (first[val]==-1) first[val] = i;
        }
        Arrays.fill(last,-1);
            int val = s.charAt(i)-'a';
            last[val] = i;
        for (int i=0 ; i<26 ; i++){
            for(int j=first[i]+1 ; j<last[i] ; j++){
        }
                set.add(s.charAt(j));
            }
    }
            HashSet<Character>set=new HashSet<>();
        int cnt=0;
            cnt+=set.size();
        return cnt;
}
