// Title: Longest Subarray With Maximum Bitwise AND
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/

        for (int i=1 ; i<nums.length ; i++){
            if (nums[i]>nums[i-1]){
                else{
            }
            else if(nums[i]==nums[i-1]){ 
                if (nums[i]==max) cnt++;
            }
            else{
                cnt=0;
            }
                if (nums[i]==max){
                    cnt=1;
                }
            ans=Math.max(cnt,ans);
                    cnt=0;
                }
                else if (nums[i]>max){
                    cnt=1;
                }
                    max=nums[i];
                    ans=1;
        }
        return ans;
    }
}