/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length - 1, preorder, inorder);    
    }
    
    public TreeNode helper(int p, int i, int e, int[] preorder, int[] inorder) {
        if (p > preorder.length - 1 || i > e) return null;
        
        TreeNode root = new TreeNode(preorder[p]);
        int idx = i;
        for (int j = i; j <= e; j++) {
            if (inorder[j] == root.val) {
                idx = j;
                break;
            }
        }
        
        root.left = helper(p + 1, i, idx - 1, preorder, inorder);
        root.right = helper(p + idx - i + 1, idx + 1, e, preorder, inorder);
        
        return root;
    }
}
