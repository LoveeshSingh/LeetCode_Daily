// Title: Sort Vowels in a String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-vowels-in-a-string/

    }

    public String sortVowels(String s) {
        for (int i=0 ; i<s.length() ; i++){
            if (vowel.containsKey(s.charAt(i))){
        }
        }
                freq[vowel.get(s.charAt(i))]++;
            }
        int[] freq = new int[10];
        for (int i=0 ; i<s.length() ; i++){
            if (!vowel.containsKey(s.charAt(i))) sb.append(s.charAt(i));
        StringBuilder sb = new StringBuilder();
        int indx=0;
            else{
                while(indx<10 && freq[indx]==0) indx++;
            }
                sb.append(vows[indx]);
                freq[indx]--;
            vowel.put(vows[i],i);
        vows = new char[]{'A','E','I','O','U','a','e','i','o','u'};
        for (int i=0 ; i<vows.length ; i++){
    Solution(){
        vowel = new HashMap<>();
class Solution {
    HashMap<Character,Integer> vowel;
    char[] vows;
