// Title: Backspace String Compare
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/backspace-string-compare/

        }
            else{
                stk1.push(s.charAt(i));
            }
        for (int i=0 ; i<t.length() ; i++){
            if (t.charAt(i)=='#'){
                if (stk2.isEmpty()) continue;
                stk2.pop();
            }
            else{
                stk2.push(t.charAt(i));
            }
        }
        if (stk1.size()!=stk2.size()) return false;
            }
                stk1.pop();
            if (s.charAt(i)=='#'){
                if (stk1.isEmpty()) continue;
        Stack<Character> stk2 = new Stack<>();
        for (int i=0 ; i<s.length() ; i++){
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
class Solution {
