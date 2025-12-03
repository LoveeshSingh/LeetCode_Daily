// Title: Build an Array With Stack Operations
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/build-an-array-with-stack-operations/

class Solution {
    public List<String> buildArray(int[] target, int n) {
        int indx=0;
        for (int i=1 ; i<=n; i++){
            if(indx==target.length){
                break;
            }
        }
        List<String> ans = new ArrayList<>();
            if (target[indx]==i) {
                indx++;
            }
            else{
                ans.add("Pop");
            }
    }
        return ans;
            ans.add("Push");
}
