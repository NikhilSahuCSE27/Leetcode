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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> a=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(a);
        ListNode head1= new ListNode(0);
       ListNode temp1=head1;
       int i=0;
       while(i<a.size()){
        temp1.next=new ListNode(a.get(i));
        temp1=temp1.next;
        i++;
       }
        return head1.next;
    }
}