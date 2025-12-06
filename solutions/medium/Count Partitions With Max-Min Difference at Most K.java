// Title: Count Partitions With Max-Min Difference at Most K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-partitions-with-max-min-difference-at-most-k/

            while (!minQ.isEmpty() && nums[minQ.peekLast()] >= nums[i]) {
                minQ.pollLast();
            }
            minQ.offerLast(i);
            // adjust window
            while (
                !maxQ.isEmpty() &&
                !minQ.isEmpty() &&
                nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > k
            ) {
                if (maxQ.peekFirst() == j) {
                    maxQ.pollFirst();
                }
                if (minQ.peekFirst() == j) {
                    minQ.pollFirst();
                }
                j++;
            }

            dp[i + 1] = (prefix[i] - (j > 0 ? prefix[j - 1] : 0) + mod) % mod;
            prefix[i + 1] = (prefix[i] + dp[i + 1]) % mod;
        }

        return (int) dp[n];
    }
}
