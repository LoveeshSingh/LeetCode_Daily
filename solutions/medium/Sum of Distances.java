// Title: Sum of Distances
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-distances/

            else{
                sum.put(nums[i],sum.get(nums[i])+i-firstOccurence.get(nums[i]));
                freq.put(nums[i],freq.get(nums[i])+1);
            }
        }
        HashMap<Integer,Integer> lastOccurence = firstOccurence;
        long[] ans = new long[nums.length];
        HashMap<Integer,Integer> done = new HashMap<>(); 
        for (int i=0 ; i<nums.length ; i++){
            long dist = i-lastOccurence.get(nums[i]);
            int left = done.getOrDefault(nums[i],0)-1;
            int right = freq.get(nums[i])-done.getOrDefault(nums[i],0)-1;
            long addn = dist*(left-right);
            sum.put(nums[i],sum.get(nums[i])+addn);
            lastOccurence.put(nums[i],i);
            done.put(nums[i],done.getOrDefault(nums[i],0)+1);
            ans[i] = sum.get(nums[i]);
        }
        return ans;
    }
}
