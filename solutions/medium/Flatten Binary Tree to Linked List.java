// Title: Flatten Binary Tree to Linked List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode flatten(TreeNode root) {
        TreeNode left = root.left;
    }
        TreeNode right = root.right;
        TreeNode last = flatten(left);
        if (root==null || (root.left==null && root.right==null)) return root;
        root.left=null;
        if (root.left==null) return flatten(root.right);
        last.right=right;
        root.right=left;
        if (right==null) return last;
        else return flatten(right);
}
