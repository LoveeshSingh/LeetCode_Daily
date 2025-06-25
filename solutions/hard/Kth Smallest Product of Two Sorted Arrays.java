// Title: Kth Smallest Product of Two Sorted Arrays
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/kth-smallest-product-of-two-sorted-arrays/

            }
            i1 = pos1;
            i2 = 0;
            while (i1 < n1 && i2 < pos2) {
                if ((long) nums1[i1] * nums2[i2] > mid) {
                    i1++;
                } else {
                    count += n1 - i1;
                    i2++;
                }
            }
            if (count < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}