// Title: Number of Steps to Reduce a Number in Binary Representation to One
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/

class Solution {
    public int numSteps(String s) {
        int carry=0;
        int cnt=0;
        for (int i=s.length()-1 ; i>0 ; i--){
            int val = s.charAt(i)-'0'+carry;
            if (val%2==1){
                cnt++;
                carry=1;
            }
            cnt++;

        }
        carry+=s.charAt(0)-'0';
        if (carry>1) cnt++;
        return cnt; 
    }
}
