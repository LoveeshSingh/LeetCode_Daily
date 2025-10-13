// Title: Find Resultant Array After Removing Anagrams
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/

class Solution {
    public List<String> removeAnagrams(String[] words) {
        int[] last = new int[26];
        List<String> ans = new ArrayList<>();
        for (String word : words){
        }
            int[] temp = new int[26];
            for (char c : word.toCharArray()) temp[c-'a']++;
            for (int i=0 ; i<26 ; i++){
            boolean flag = true;
                if (temp[i]!=last[i]){
            } 
                    flag = false;
                }
                    break;
            if (!flag){
                ans.add(word);
            }
    }
                last = temp;
        return ans;
}
