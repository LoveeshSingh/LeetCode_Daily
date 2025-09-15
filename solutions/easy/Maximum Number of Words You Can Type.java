// Title: Maximum Number of Words You Can Type
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-number-of-words-you-can-type/

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        boolean[] broken = new boolean[26];
        for (int i=0 ; i<brokenLetters.length() ; i++){
            broken[brokenLetters.charAt(i)-'a']=true;
        }

        int cnt=0;
        for (String word : words){
            for (char c : word.toCharArray()){
        }
                if (broken[c-'a']){
            }
            boolean flag = true;
                    flag=false;
                }
    }
                    break;
            if (flag) cnt++;
        return cnt;
}
