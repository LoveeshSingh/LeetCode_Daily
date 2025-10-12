// Title: Find Sum of Array Product of Magical Sequences
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/find-sum-of-array-product-of-magical-sequences/

                        if (q2 > k) {
                            break;
                        }
                        for (int r = 0; r + j <= m; r++) {
                            int p2 = p / 2 + r;
                            f[i + 1][j + r][p2][q2] +=
                                (((f[i][j][p][q] * numsPower[i + 1][r]) % mod) *
                                    ifac[r]) %
                                mod;
                            f[i + 1][j + r][p2][q2] %= mod;
                        }
                    }
                }
            }
        }
        long res = 0;
        for (int p = 0; p <= m * 2; p++) {
            for (int q = 0; q <= k; q++) {
                if (Integer.bitCount(p) + q == k) {
                    res = (res + ((f[n - 1][m][p][q] * fac[m]) % mod)) % mod;
                }
            }
        }
        return (int) res;
    }
}
