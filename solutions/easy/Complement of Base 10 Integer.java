// Title: Complement of Base 10 Integer
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/complement-of-base-10-integer/

class Solution {
    public int bitwiseComplement(int N) {
        int mask = 1;

        while (mask < N)
            mask = (mask << 1) | 1;

        return mask ^ N;
    }
}
