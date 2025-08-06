// Title: Fruits Into Baskets III
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/fruits-into-baskets-iii/

        build(1, 0, m - 1);
        for (int i = 0; i < fruits.length; i++) {
            int l = 0;
            int r = m - 1;
            int res = -1;
            while (l <= r) {
                int mid = (l + r) >> 1;
                if (query(1, 0, m - 1, 0, mid) >= fruits[i]) {
                    res = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (res != -1 && baskets[res] >= fruits[i]) {
                update(1, 0, m - 1, res, Integer.MIN_VALUE);
            } else {
                count++;
            }
        }
        return count;
    }
}