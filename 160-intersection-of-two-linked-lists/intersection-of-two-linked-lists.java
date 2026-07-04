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
        ListNode x=headA;
        ListNode y=headB;
        int c1=0;
        int c2=0;
        while(x!=null){
            x=x.next;
            c1++;
        }
        while(y!=null){
            y=y.next;
            c2++;
        }
     ListNode slow=headA;
        ListNode fast=headB;
        int k;
        if(c1>c2){
            k=c1-c2;
              for(int i=0;i<k;i++){
              slow=slow.next;
        }
        while(fast!=null){
            
          if(slow==fast){
            return slow;
          }
          slow=slow.next;
            fast=fast.next;
        }
        }else{
                k=c2-c1;
                 for(int i=0;i<k;i++){
          
             fast=fast.next;
        }
        while(slow!=null){
          
          if(slow==fast){
            return slow;
          }
          slow=slow.next;
            fast=fast.next;
        }

        }
       
      return null;
        
    }
}