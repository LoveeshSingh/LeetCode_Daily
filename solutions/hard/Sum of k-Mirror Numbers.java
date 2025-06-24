// Title: Sum of k-Mirror Numbers
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-k-mirror-numbers/

                    }
                }
            }
            left = right;
        }
        return ans;
    }

    private boolean isPalindrome(long x, int k) {
        int length = -1;
        while (x > 0) {
            ++length;
            digit[length] = (int) (x % k);
            x /= k;
        }
        for (int i = 0, j = length; i < j; ++i, --j) {
            if (digit[i] != digit[j]) {
                return false;
            }
        }
        return true;
    }
}