// Title: Smallest Missing Non-negative Integer After Operations
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-missing-non-negative-integer-after-operations/

class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq = new int[value];
        for (int i=0 ; i<nums.length ; i++){
            freq[((nums[i]%value)+value)%value]++;
        }
        for (int i=freq.length-1 ; i>=0 ; i--){
            if (min>=freq[i]){
        }
        int min = Integer.MAX_VALUE;
        int indx=-1;
                min = freq[i];
            }
    }
                indx = i;
        return indx+freq[indx]*value;
}
