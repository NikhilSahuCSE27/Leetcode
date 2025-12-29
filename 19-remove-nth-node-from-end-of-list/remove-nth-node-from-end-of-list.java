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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int p=count-n;
         if (p==0){
          return head.next;
        }
        int i=0;
        temp=head;
        while(i!=p-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}