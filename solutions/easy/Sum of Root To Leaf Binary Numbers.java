// Title: Sum of Root To Leaf Binary Numbers
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/

 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }

    public int dfs(TreeNode root , int num){
        if (root.left!=null)ans+=dfs(root.left,num);
        num<<=1;
        num+=root.val;
        if (root.right!=null)ans+=dfs(root.right,num);
        int ans=0;
        return Math.max(ans,num);
    }
 *     TreeNode() {}
}
