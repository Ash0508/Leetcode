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
    public ListNode reverseList(ListNode head) {
  //           if(head==null) return null;
  // if(head.next==null) return head;
  //  ListNode h=reverseList(head.next);
  //   head.next.next=head; 
  //   head.next=null;
  //   return h;

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
}