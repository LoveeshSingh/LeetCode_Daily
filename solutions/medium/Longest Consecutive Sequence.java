// Title: Longest Consecutive Sequence
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-consecutive-sequence/

            parent[parent2]=parent1;
            size[parent1]+=size[parent2];
        }  
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        DSU dsu = new DSU(nums.length);
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for (int i=0 ; i<nums.length ; i++){
            if (map.containsKey(nums[i])) continue;
            map.put(nums[i],val++);
            if (map.containsKey(nums[i]-1)) dsu.union(map.get(nums[i]),map.get(nums[i]-1));
            if (map.containsKey(nums[i]+1)) dsu.union(map.get(nums[i]),map.get(nums[i]+1));
            ans=Math.max(ans,dsu.size[dsu.find(map.get(nums[i]))]);
        }
    }
        else{
        return ans;
        int val=0;
}
