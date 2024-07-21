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
 public boolean findTarget(TreeNode root, int k) {
return dfs(root,root,k);
}
public boolean dfs(TreeNode root,TreeNode cur,int k){
if(cur==null) return false;

    if(search(root,cur,k-cur.val)) return true;
    
   return dfs(root,cur.left,k) || dfs(root,cur.right,k);
}
public boolean search(TreeNode root,TreeNode cur,int k){
    if(root==null) return false;
    if(root.val==k && cur.val!=k) return true;
    else if(k>root.val) return search(root.right,cur,k);
    else return search(root.left,cur,k);
}
}