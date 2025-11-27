// Title: Add to Array-Form of Integer
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/add-to-array-form-of-integer/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i=num.length-1 ; i>=0 ; i--){
        }
            ans.add((num[i]+k%10+rem%10)%10);
            rem=(num[i]+k%10+rem%10)/10;
        int rem=0;
            k/=10;
        while(k>0 || rem>0){
            ans.add((k%10+rem%10)%10);
        }
    }
            rem=(k%10+rem%10)/10;
            k/=10;
        Collections.reverse(ans);
        return ans;
}
