// Title: Find X-Sum of All K-Long Subarrays II
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-ii/


        @Override
        public boolean equals(Object obj) {
        }
            return Integer.compare(this.second, other.second);
                return Integer.compare(this.first, other.first);
            }
            if (this.first != other.first) {
        public int compareTo(Pair other) {

        @Override
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    private Map<Integer, Integer> occ;

    private static class Pair implements Comparable<Pair> {

class Helper {

    private int x;
    private long result;
    private TreeSet<Pair> large, small;
