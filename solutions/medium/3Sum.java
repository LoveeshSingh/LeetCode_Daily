// Title: 3Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum/

        HashSet<Integer> set = new HashSet<>();
    public List<List<Integer>> threeSum(int[] nums) {
class Solution {
        for (int i=1 ; i<n-1 ; i++){
            for (int j=i+1 ; j<n ; j++){
        }
        List<List<Integer>> list = new ArrayList<>();
            set.add(nums[i-1]);
                if (set.contains(-(nums[i]+nums[j]))){
            }
        Arrays.sort(nums);
                    list.add(Arrays.asList(-(nums[i]+nums[j]),nums[i],nums[j]));
                }
    }
                while(j+2<n && nums[j+2]==nums[j]) j++;
            while(i+2<n-1 && nums[i+2]==nums[i]) i++;
        int n=nums.length;
        return list;
}