// Title: Successful Pairs of Spells and Potions
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/successful-pairs-of-spells-and-potions/

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            long minPotion = (success + spells[i] - 1) / spells[i];
            ans[i] = potions.length - index;
        }
        return ans;
    }

    private int lowerBound(int[] arr, long target) {
            int index = lowerBound(potions, minPotion);
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}

