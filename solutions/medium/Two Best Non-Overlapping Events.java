// Title: Two Best Non-Overlapping Events
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/two-best-non-overlapping-events/

        // Sort the times: first by time, then by type (end before start for same time)
        times.sort((a, b) ->
            a[0] == b[0]
                ? Integer.compare(a[1], b[1])
                : Integer.compare(a[0], b[0])
        );

        int ans = 0, maxValue = 0;

        // Process the sorted times
        for (int[] timeValue : times) {
            if (timeValue[1] == 1) {
                // Start time: Calculate the maximum sum
                ans = Math.max(ans, timeValue[2] + maxValue);
            } else {
                // End time: Update the maximum value seen so far
                maxValue = Math.max(maxValue, timeValue[2]);
            }
        }

        return ans;
    }
}

        }
            times.add(new int[] { event[1] + 1, 0, event[2] });
            // 0 denotes end time
