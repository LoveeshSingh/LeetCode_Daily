// Title: Koko Eating Bananas
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/koko-eating-bananas/

        for (int i=0 ; i<piles.length ; i++){
            right=Math.max(right,piles[i]);
        }
        while(left<=right){
            int mid = (left+right)/2;
        int ans = right;
            for (int i=0 ; i<piles.length ; i++){
                cnt+=((piles[i]-1)/mid+1);
            long cnt=0;
            }
            if (cnt<=h){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
                ans=Math.min(ans,mid);
            
            System.out.println(left+" "+right);
        }
        return ans;
    }
}