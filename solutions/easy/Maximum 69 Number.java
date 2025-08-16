// Title: Maximum 69 Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-69-number/

class Solution {
    public int maximum69Number (int num) {
        for(int i=0 ; i<str.length() ; i++){
            else if (str.charAt(i)=='9') ans=ans*10+9;
        }   
        String str = ""+num;
        int ans=0;
        boolean flag=false;
            if (flag) ans=ans*10+str.charAt(i)-'0';
            else{
                ans=ans*10+9;
            }
    }
                flag=true;
        return ans;
            // System.out.println(ans);
}