/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int m=0,n=0;
        ListNode curr1 = headA;
        ListNode curr2 = headB;

        while(curr1!=null)
        {
           m++;
           curr1=curr1.next;
        }
        while(curr2 != null)
        {
          n++;
          curr2=curr2.next;
        }
        curr1 = headA;
        curr2 = headB;

        if (m < n)
        {
            for(int i=1;i<=n-m;i++)
            {
                curr2=curr2.next;
            }
        }
        else
        {
            for(int j=1;j<=m-n;j++)
            {
                curr1=curr1.next;
            }
        }

         while (curr1 != curr2)
       {
            curr1=curr1.next;
            curr2=curr2.next;
       }
         return curr1;
    }
}