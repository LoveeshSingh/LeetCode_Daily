// Title: Largest Rectangle in Histogram
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/largest-rectangle-in-histogram/

    for (int i = 1; i < heights.length; i++) {
        int j = i - 1;
        while (j >= 0) {
            if (heights[j] >= heights[i])
                j = j - left[j] - 1;
            else break;
        }
        left[i] = i - j - 1;
    }
    for (int i = heights.length - 2; i >= 0; i--) {
        int j = i + 1;
        while (j < heights.length) {
            if (heights[j] >= heights[i])
                j = j + right[j] + 1;
            else break;
        }
        right[i] = j - i - 1;
    }
    int ans = 0;
    for (int i = 0; i < heights.length; i++)
        ans = Math.max(ans, (left[i] + right[i] + 1) * heights[i]);
    return ans;
    }
}
