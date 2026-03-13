// Title: Minimum Number of Seconds to Make Mountain Height Zero
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-number-of-seconds-to-make-mountain-height-zero/

        long l = 1;
        long r =
            ((long) maxWorkerTimes * mountainHeight * (mountainHeight + 1)) / 2;
        long ans = 0;

        while (l <= r) {
            long mid = (l + r) / 2;
            long cnt = 0;
            for (int t : workerTimes) {
                long work = mid / t;
                // find the largest k such that 1+2+...+k <= work
                long k = (long) ((-1.0 + Math.sqrt(1 + work * 8)) / 2 + EPS);
                cnt += k;
            }

            if (cnt >= mountainHeight) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
}
