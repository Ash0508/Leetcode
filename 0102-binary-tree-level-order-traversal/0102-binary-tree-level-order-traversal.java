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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> wrapList=new ArrayList<>();
        if(root==null){
            return wrapList;
        }
        q.offer(root);
        while(q.size()!=0){
            int levelNum=q.size();
            ArrayList<Integer> subList=new ArrayList<Integer>();
            for(int i=0;i<levelNum;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                subList.add(q.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
        
    }
}