// Title: Delete Characters to Make Fancy String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/delete-characters-to-make-fancy-string/

class Solution {
    public String makeFancyString(String s) {
        for (int i=0 ; i<s.length() ; i++){
            if (s.charAt(i)==last){
        }
        char last='0';
        int cnt=0;
                cnt++;
            }
        StringBuilder ans = new StringBuilder();
            else{
                cnt=1;
            }
    }
                last=s.charAt(i);
            if (cnt<=2) ans.append(last);
        return ans.toString();
}