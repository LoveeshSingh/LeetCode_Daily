// Title: Replace Non-Coprime Numbers in Array
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/replace-non-coprime-numbers-in-array/

        for (int i=0 ; i<nums.length ; i++){
            while(!stk.isEmpty()){
                int val = stk.pop();
                int gcd = GCD(val,nums[i]);
                if (gcd>1){
                else{
                }
                    nums[i]= LCM(val,nums[i],gcd);
        return x*(y/gcd);
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        }
        return x;
    }

    public int LCM(int x , int y , int gcd){
            x=temp;
                System.out.println(gcd);
            y=x%y;
            int temp = y;
        while (y!=0){
    public int GCD(int x , int y){
class Solution {
