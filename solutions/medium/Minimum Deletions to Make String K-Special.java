// Title: Minimum Deletions to Make String K-Special
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-deletions-to-make-string-k-special/

class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (int i=0 ; i<word.length() ; i++){
            freq[word.charAt(i)-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for (int i=0 ; i<26 ; i++){
            if (freq[i]==0) continue;
            int cnt=0;
            for (int j=0 ; j<26 ; j++){
                if (freq[j]==0) continue;
                if (freq[j]<freq[i]) cnt+=freq[j];
                else if (freq[j]>freq[i]+k) cnt+=freq[j]-freq[i]-k;
            }
            min=Math.min(cnt,min);
        }
        return min;
    }
} 

