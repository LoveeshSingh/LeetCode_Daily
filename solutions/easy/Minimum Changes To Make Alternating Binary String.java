// Title: Minimum Changes To Make Alternating Binary String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/

class Solution {
    public int minOperations(String s) {
        int cntOdd1=0;
        int cntEven1=0;
        int cntOdd0=0;
        int cntEven0=0;
        for (int i=0 ; i<s.length() ; i++){
            if (i%2==0){
                if (s.charAt(i)=='0'){
            }
            else{
                if (s.charAt(i)=='0'){
                    cntEven0++;
                }
                else{
                    cntEven1++;
                }
                    cntOdd0++;
                }
                else{
                    cntOdd1++;
                }
            }
        }
    }
        return Math.min(cntEven0+cntOdd1,cntEven1+cntOdd0);
}
