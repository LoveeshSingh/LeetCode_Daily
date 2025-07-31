// Title: Maximum Product Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-product-subarray/

            int temp = min;
            min=Math.min(temp,max);
            max=Math.max(temp,max);
            ans=Math.max(ans,max);
            if (min==0 || max==0){
                min=1;
            }
                max=1;
            if (min<0) min*=nums[i];
            else min=nums[i];
            if (max>0) max*=nums[i];
            else max=nums[i];
        }
        return ans;
    }
        for (int i=0 ; i<nums.length ; i++){
        int ans =Integer.MIN_VALUE;
        int max = 1;
}
        int min = 1;