// Title: Count Submatrices With All Ones
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-submatrices-with-all-ones/

        int res = 0;
                heights[i] = row[i] == 0 ? 0 : heights[i] + 1;
        for (int[] row : mat) {
            for (int i = 0; i < n; i++) {
            }
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[] { -1, 0, -1 });
            for (int i = 0; i < n; i++) {
                int h = heights[i];
                while (stack.peek()[2] >= h) {
                    stack.pop();
                }
                int[] top = stack.peek();
                int j = top[0];
                int prev = top[1];
                int cur = prev + (i - j) * h;
                stack.push(new int[] { i, cur, h });
                res += cur;
            }
        }
        return res;
    }
}
