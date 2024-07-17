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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> r=new ArrayList<>();
        if(root==null) return r;
        Deque<TreeNode> q=new LinkedList<>();
        q.offer(root);
        {
            boolean reverse=false;
            while(!q.isEmpty())
            {
                int l=q.size();
                List<Integer> curr=new ArrayList<>(l);

                for(int i=0;i<l;i++)
                {
                    if(!reverse)
                    {
                        TreeNode currN=q.pollFirst();
                        curr.add(currN.val);

                        if(currN.left!=null)
                        q.addLast(currN.left);
                        if(currN.right!=null)
                        q.addLast(currN.right);
                    }
                    else{
                        TreeNode currN=q.pollLast();
                        curr.add(currN.val);
                        if(currN.right!=null)
                        q.addFirst(currN.right);
                        if(currN.left!=null)
                        q.addFirst(currN.left);
                    }
                    
                }
                reverse=!reverse;
                r.add(curr);

            }
            return r;
        }
        
    }
}