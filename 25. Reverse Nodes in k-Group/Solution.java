import java.*;
class Solution {
   public ListNode reverse(ListNode head){
        ListNode ahead = head;
        ListNode prev = null;
        ListNode current = head;
        while(ahead!=null){
            ahead=ahead.next;
            current.next=prev;
            prev=current;
            current=ahead;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null)
        return head;
        if(k==0)
        return head;

        int n =k;


        ListNode temp=head;
        while(n>1 && temp!=null){
            temp=temp.next;
            n-=1;
        }
        ListNode h=null;
        if(temp==null)
        return head;
        h = reverseKGroup(temp.next,k);
        temp.next=null;
        ListNode r = reverse(head);
        head.next=h;
        return r;
    }
}