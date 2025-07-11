// Title: Subarray Sums Divisible by K
            // Difficulty: Medium
            // Language: C++
            // Link: https://leetcode.com/problems/subarray-sums-divisible-by-k/

class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int n=nums.size();
        unordered_map<int,int>mp;
        int sum=0,ans=0;
        for(int i=0;i<n;++i){
            sum+=nums[i];
        }
    }
        mp[0]=1;
            mp[(sum%k+k)%k]++;
            ans+=mp[(sum%k+k)%k]; 
        return ans;
};