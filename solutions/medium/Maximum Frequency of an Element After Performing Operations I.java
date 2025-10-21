// Title: Maximum Frequency of an Element After Performing Operations I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-i/

        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < value) {
        int left = 0;
    private int leftBound(int[] nums, int value) {
    }

        }

        return ans;
            }
            ans = Math.max(ans, tempAns);
                tempAns = Math.min(r - l + 1, numOperations);
            } else {
                tempAns = Math.min(r - l + 1, numCount.get(i) + numOperations);
            if (numCount.containsKey(i)) {
            int tempAns;
            int l = leftBound(nums, i - k);
            int r = rightBound(nums, i + k);
        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
        ans = Math.max(ans, nums.length - lastNumIndex);

                left = mid + 1;
            } else {
                right = mid;
            }
        }
