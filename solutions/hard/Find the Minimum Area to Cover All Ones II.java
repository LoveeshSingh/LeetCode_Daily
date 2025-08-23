// Title: Find the Minimum Area to Cover All Ones II
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-ii/

                    minimumSum2(grid, 0, i, j + 1, m - 1) +
                    minimumSum2(grid, i + 1, n - 1, 0, m - 1)
                );
            }
        }
        for (int i = 0; i + 2 < n; i++) {
            for (int j = i + 1; j + 1 < n; j++) {
                res = Math.min(
                    res,
                    minimumSum2(grid, 0, i, 0, m - 1) +
                    minimumSum2(grid, i + 1, j, 0, m - 1) +
                    minimumSum2(grid, j + 1, n - 1, 0, m - 1)
                );
            }
        }
        return res;
    }

    public int minimumSum(int[][] grid) {
        int[][] rgrid = rotate(grid);
        return Math.min(solve(grid), solve(rgrid));
    }
}
