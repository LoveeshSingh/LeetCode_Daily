// Title: Find Kth Bit in Nth Binary String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

class Solution {
    public char findKthBit(int n, int k) {
        int last = 0;
        int flips = 0;
        for (int i=n; i>1 ; i--){
            int left = (int)Math.pow(2,i-1)-1;
        }
            if (k<=left){
                
            }
            else if (k==left+1){
                last = 1;
            }
            else{
                flips++;
            }
    }
                break;
                k=left+left+1-k+1;
        return (char)('0'+(last+flips)%2);
}
