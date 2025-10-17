// Title: Maximize the Number of Partitions After Operations
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/maximize-the-number-of-partitions-after-operations/

                } else {
                    num++;
                    mask = binary;
                    count = 1;
                }
            }
            right[i - 1][0] = num;
            right[i - 1][1] = mask;
            right[i - 1][2] = count;
        }

        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            int seg = left[i][0] + right[i][0] + 2;
            int totMask = left[i][1] | right[i][1];
            int totCount = Integer.bitCount(totMask);
            if (left[i][2] == k && right[i][2] == k && totCount < 26) {
                seg++;
            } else if (Math.min(totCount + 1, 26) <= k) {
                seg--;
            }
            maxVal = Math.max(maxVal, seg);
        }
        return maxVal;
    }
}
