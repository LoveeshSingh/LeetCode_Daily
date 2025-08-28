// Title: Remove Duplicate Letters
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/remove-duplicate-letters/

            while(!stk.isEmpty() && stk.peek()>=s.charAt(i)){
        }
                if (freq[stk.peek()-'a']-->1){
            }
                    stk.pop();
                }
                else break;
            stk.push(s.charAt(i));
            visited[s.charAt(i)-'a']=true;
                    visited[stk.peek()-'a']=false;
            if (visited[s.charAt(i)-'a']){

        for (int i=0 ; i<s.length() ; i++){
        boolean[] visited = new boolean[26];
        }
            freq[s.charAt(i)-'a']++;
        for (int i=0 ; i<s.length() ; i++){
        int[] freq = new int[26];
    public String removeDuplicateLetters(String s) {
        Stack<Character> stk = new Stack<>();
class Solution {
                freq[s.charAt(i)-'a']--;
            } 
                continue;
