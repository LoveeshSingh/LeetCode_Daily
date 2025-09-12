// Title: Vowels Game in a String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/vowels-game-in-a-string/

class Solution {
    HashSet<Character> vowel;
    Solution(){
        vowel = new HashSet<>();
        for(char vow : vows) vowel.add(vow);
    }
    public boolean doesAliceWin(String s) {
        for (int i=0 ; i<s.length() ; i++){
    char[] vows ;
        vows =  new char[]{'a','e','i','o','u'};
            if (vowel.contains(s.charAt(i))){
        }
                return true;
            }
    }
        return false;
}
