// Title: Lexicographically Smallest String After Applying Operations
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/lexicographically-smallest-string-after-applying-operations/

    }

    public void add(char[] t, int n, int a, int start) {
        int minVal = 10;
        int times = 0;
        for (int i = 0; i < 10; i++) {
            int added = ((t[start] - '0') + i * a) % 10;
            if (added < minVal) {
                minVal = added;
                times = i;
            }
        }
        for (int i = start; i < n; i += 2) {
            t[i] = (char) ('0' + (((t[i] - '0') + times * a) % 10));
        }
    }

    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }
}
