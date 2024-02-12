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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode agla=null;
        ListNode curr=head;
        
        while(curr!=null)
        {
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
     
    public int pairSum(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        int s=0;
        int max=Integer.MIN_VALUE;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode temp=reverse(slow.next);
        slow.next=temp;

        ListNode  p1=head;
        ListNode  p2=slow.next;
        
        
        while(p2!=null)
        {
        s=p1.val+p2.val;
            if(s>max)  max=s;
            p1=p1.next;
            p2=p2.next;
        }
      return max;
        
    }
}