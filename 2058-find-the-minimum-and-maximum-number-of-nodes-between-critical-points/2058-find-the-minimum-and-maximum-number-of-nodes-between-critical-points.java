/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
      List<Integer> al=new ArrayList<>();
      if(head.next.next==null){
        int ans[]={-1,-1};
        return ans;
      }
      int idx=1;
      ListNode prev=head;
      ListNode curr=head.next;
      ListNode fwd=head.next.next;

      while(fwd!=null)
      {
        if(prev.val>curr.val && fwd.val>curr.val) al.add(idx);
        else if(prev.val<curr.val && fwd.val<curr.val) al.add(idx);
        prev=prev.next;
        curr=curr.next;
        fwd=fwd.next;
        idx++;
      }
      if(al.size()<2){
        int ans[]={-1,-1};
        return ans;
      }

      int min=Integer.MAX_VALUE;
      for(int i=1;i<al.size();i++){
      min=Math.min(min,al.get(i)-al.get(i-1));}
      int ans[]=new int[2];
      ans[0]=min;
      ans[1]=al.get(al.size()-1)-al.get(0);
      return ans;
    }
}