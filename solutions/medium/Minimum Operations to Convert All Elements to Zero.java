// Title: Minimum Operations to Convert All Elements to Zero
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-operations-to-convert-all-elements-to-zero/

class·‌Solution·‌{
·‌·‌·‌·‌public·‌int·‌minOperations(int[]·‌nums)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌Stack<Integer>·‌stk·‌=·‌new·‌Stack<>();
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i=0·‌;·‌i<nums.length·‌;·‌i++){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌while(!stk.isEmpty()·‌&&·‌nums[i]<stk.peek()){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌stk.pop();
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌stk.push(nums[i]);
·‌·‌·‌·‌·‌·‌·‌·‌int·‌ans=0;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌cntr·‌=·‌Integer.MAX_VALUE;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(stk.peek()<cntr){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌ans++;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌cntr=stk.peek();
·‌·‌·‌·‌·‌·‌·‌·‌while(!stk.isEmpty()·‌&&·‌stk.peek()>0){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(stk.peek()<cntr){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌ans++;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌cntr=stk.peek();
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌stk.pop();
·‌·‌·‌·‌·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌return·‌ans;
·‌·‌·‌·‌}
·‌·‌·‌·‌·‌·‌·‌·‌int·‌cntr·‌=·‌Integer.MAX_VALUE;
}
