// Title: Binary Tree Cameras
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-cameras/

        return cnt;
    }

    public int dfs(TreeNode root){
        // System.out.println(root.val);
        if (root==null) return 0;
        int max;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left==1 || right==1){
            cnt++;
            return -1;
        }
        int min = Math.min(left,right);
        return min+1;
    }
}
//    0
//   0
//  0 0
