// Title: Sort Integers by The Number of 1 Bits
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/

        // Convert the sorted array back to primitive integers
        int[] sortedArr = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();

        return sortedArr;
    }
}

class BitCountComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        // Compare based on the count of set bits (1s) in the binary representation
        int bitCountA = Integer.bitCount(a);
        int bitCountB = Integer.bitCount(b);

        if (bitCountA == bitCountB) {
            // If bit counts are the same, compare numerically

        Arrays.sort(integerArr, comparator);

        // Sort the array using the custom comparator
        // Create a custom comparator to sort by bit count and then numerically
        Comparator<Integer> comparator = new BitCountComparator();
    public int[] sortByBits(int[] arr) {
        // Convert the input integer array to Integer objects for sorting
        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

class Solution {
