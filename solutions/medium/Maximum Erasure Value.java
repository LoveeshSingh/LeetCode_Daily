// Title: Maximum Erasure Value
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-erasure-value/

        for (int i=0 ; i<nums.length ; i++){
            if (set.contains(nums[i])){
        }
        int ans=0;
        int start=0;
            }
            else{
                set.add(nums[i]);
            }
                curr+=nums[i];
                ans = Math.max(curr,ans);
                while(start<i){
                    if (nums[start]==nums[i]){
                }
                    set.remove(nums[start++]);
                        break;
                    } 
    }
                        start++;
        return ans;
                    curr-=nums[start];
}