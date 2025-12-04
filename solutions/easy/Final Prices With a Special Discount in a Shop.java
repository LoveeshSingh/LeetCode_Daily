// Title: Final Prices With a Special Discount in a Shop
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for (int i=prices.length-1 ; i>=0 ; i--){
            while (stk.peek()>prices[i]) stk.pop();
            if (val!=prices[i]) stk.push(prices[i]);
        }
    }
            int val = stk.peek();
            prices[i]-=val;
        return prices;
}
