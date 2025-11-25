// Title: Sum of Distances
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-distances/

        }
                firstOccurence.put(nums[i],i);
            }
                sum.put(nums[i],0L);
            else{
                sum.put(nums[i],sum.get(nums[i])+i-firstOccurence.get(nums[i]));
            }
        long[] ans = new long[nums.length];
        HashMap<Integer,Integer> lastOccurence = firstOccurence;
        for (int i=0 ; i<nums.length ; i++){
            long dist = i-lastOccurence.get(nums[i]);
                freq.put(nums[i],1);
                freq.put(nums[i],freq.get(nums[i])+1);
        HashMap<Integer,Integer> done = new HashMap<>(); 
            lastOccurence.put(nums[i],i);
            long addn = dist*(left-right);
        }
            sum.put(nums[i],sum.get(nums[i])+addn);
            done.put(nums[i],done.getOrDefault(nums[i],0)+1);
            ans[i] = sum.get(nums[i]);
        for (int i=0 ; i<nums.length ; i++){
            if (!firstOccurence.containsKey(nums[i])){
        return ans;
    }
            int left = done.getOrDefault(nums[i],0)-1;
            int right = freq.get(nums[i])-done.getOrDefault(nums[i],0)-1;
}
