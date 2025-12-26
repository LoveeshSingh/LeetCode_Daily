// Title: Minimum Penalty for a Shop
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-penalty-for-a-shop/

class Solution {
    public int bestClosingTime(String customers) {
        int presum = 0;
        int postsum = 0;
        for (int i=0 ; i<customers.length(); i++){
            if (customers.charAt(i)=='Y') postsum++;
        }
            if (customers.charAt(i)=='Y'){   
        }
        for (int i=0 ; i<customers.length(); i++){
            if(penalty>presum+postsum){
        int ans = 0;
        int penalty=Integer.MAX_VALUE;
                ans = i;
            }
                penalty = presum+postsum;
                postsum--;
            }  
            else presum++;
        return ans;
        if(penalty>presum+postsum){
            ans = customers.length();
            penalty = presum+postsum;
        }

    }
}
