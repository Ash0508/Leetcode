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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i],i);
        }
        return help(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
    
    public TreeNode help(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend, HashMap<Integer,Integer> map) {
        if(instart > inend || poststart > postend) return null;

        TreeNode root = new TreeNode(postorder[postend]);
        int rootIndexInInorder = map.get(root.val);
        int numLeft = rootIndexInInorder - instart;

        root.left = help(inorder, instart, rootIndexInInorder - 1, postorder, poststart, poststart + numLeft - 1, map);
        root.right = help(inorder, rootIndexInInorder + 1, inend, postorder, poststart + numLeft, postend - 1, map);

        return root;
    }
}
