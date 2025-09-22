// Title: Count Elements With Maximum Frequency
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/count-elements-with-maximum-frequency/

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for (int i=0 ; i<nums.length ; i++){
            freq[nums[i]]++;
        }
        return cnt*max;
        int max=0;
        int cnt=0;
            if (freq[nums[i]]>max){
                max=freq[nums[i]];
            }
                cnt=1;
            else if (freq[nums[i]]==max){
                cnt++;
            }
    }
}
