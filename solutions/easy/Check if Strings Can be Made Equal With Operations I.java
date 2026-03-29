// Title: Check if Strings Can be Made Equal With Operations I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int[] even = new int[26];
        for (int i=0 ; i<s1.length() ; i++){
            if (i%2==0){
            }
        }
            else{
                odd[s1.charAt(i)-'a']++;
            }
        for (int i=0 ; i<s2.length() ; i++){
            if (i%2==0){
        int[] odd = new int[26];
                even[s1.charAt(i)-'a']++;
                even[s2.charAt(i)-'a']--;
            }
            else{
                odd[s2.charAt(i)-'a']--;
            }
        }
    }
                if (even[s2.charAt(i)-'a']<0) return false;
                if (odd[s2.charAt(i)-'a']<0) return false;
        return true;
}
