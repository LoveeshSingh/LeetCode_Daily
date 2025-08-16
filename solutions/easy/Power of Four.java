// Title: Power of Four
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/power-of-four/

class Solution {
    public boolean isPowerOfFour(int n) {
        int cnt=0;
        int posn=0;
        while(n>0){
            if ((n&1)==1){
        } 
        if (n<=0) return false;
                cnt++;
            }
    }
                if (check) check=false;
        boolean check=true;
            if (check) posn++; 
        if (cnt==1 && posn%2==0) return true;
        return false;
            n>>=1;
}