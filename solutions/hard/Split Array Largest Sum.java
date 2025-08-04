// Title: Split Array Largest Sum
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/split-array-largest-sum/

            for (int i=0 ; i<nums.length ; i++){
                curr+=nums[i];
            }
            int cnt=1;
            int curr=0;
                if (curr>mid){
                    cnt++;
                }
                    curr=nums[i];
            if (cnt<=k){
                ans=Math.min(ans,mid);
            }
                right=mid-1;
            int mid=(left+right)/2;
        while(left<=right){
        int ans=right;
        }
            left=Math.max(left,nums[i]);
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}