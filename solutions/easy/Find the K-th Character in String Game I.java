// Title: Find the K-th Character in String Game I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/

class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder();
        str.append('a');
        while(str.length()<k){
            int index=str.length();
        }
            for (int i=0 ; i<index && str.length()<k ; i++){
            }
    }
                else str.append((char)(str.charAt(i)+1));
                if (str.charAt(i)=='z') str.append('a');
        return str.charAt(str.length()-1);
}