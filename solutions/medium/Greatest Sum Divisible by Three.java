// Title: Greatest Sum Divisible by Three
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/greatest-sum-divisible-by-three/

    public int maxSumDivThree(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0 ; i<3 ; i++) list.add(new ArrayList<>());
        for (int i=0 ; i<nums.length ; i++){
            list.get(nums[i]%3).add(nums[i]);
        }
        for (int i=0 ; i<3 ; i++) Collections.sort(list.get(i));
class Solution {
        int total = 0;
            total+=nums[i];
        if (total%3==1){
        }
        else if (total%3==2){
            if (list.get(2).size()>0) remove = list.get(2).get(0);
        }
    }
            if (list.get(1).size()>0) remove = list.get(1).get(0);
            if (list.get(2).size()>1) remove = Math.min(list.get(2).get(0)+list.get(2).get(1),remove);
        int remove = Integer.MAX_VALUE;
            if (list.get(1).size()>1) remove = Math.min(list.get(1).get(0)+list.get(1).get(1),remove);
        return total-remove;
        if (remove == Integer.MAX_VALUE) return total;
}
