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
    public int kthSmallest(TreeNode root, int k) {
        int[] count = new int[]{0};
        int[] kthSmallest = new int[]{Integer.MIN_VALUE};
        inorderHelper(root, count, k, kthSmallest);
        return kthSmallest[0];
    }

    public void inorderHelper(TreeNode root, int[] count, int k, int[] kthSmallest) {
        if (root == null || count[0] >= k) return;
        inorderHelper(root.left, count, k, kthSmallest);
        count[0]++;
        if (count[0] == k) {
            kthSmallest[0] = root.val;
            return;
        }
        inorderHelper(root.right, count, k, kthSmallest);
    }
}
