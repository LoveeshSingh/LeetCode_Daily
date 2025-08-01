// Title: Pascal's Triangle
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/pascal's-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> soln = new ArrayList<>();
        for(int i=0 ; i<numRows ; i++){
            soln.add(nCr(i));
        }
        return soln;
    }

    public List<Integer> nCr(int n){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        int i;
        for (i=1 ; i<=n/2 ; i++){
            arr.add(arr.get(i-1)*(n-i+1)/i);
        }
        i--;
        if (n%2==0){
            i--;
        }
        for (; i>=0 ; i--){
            arr.add(arr.get(i));
        }
        return arr;