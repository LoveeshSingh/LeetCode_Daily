// Title: Count Collisions on a Road
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-collisions-on-a-road/


    public int countCollisions(String directions) {
        int n = directions.length();
        int l = 0;
        int r = n - 1;

        while (l < n && directions.charAt(l) == 'L') {
            l++;
        }

        while (r >= l && directions.charAt(r) == 'R') {
            r--;
        }

        int res = 0;
        for (int i = l; i <= r; i++) {
            if (directions.charAt(i) != 'S') {
                res++;
            }
        }
        return res;
    }
}
