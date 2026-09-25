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

        if(head == null) return head;
        
        ListNode curr = head;
        ListNode nxt = head.next;

        while(nxt != null){
            
            if(curr == head){
               
               curr.next = null;
               ListNode temp = nxt.next;
               nxt.next = curr;
               curr = nxt;
               nxt = temp;

            }
            else{
               
               ListNode temp = nxt.next;
               nxt.next = curr;
               curr = nxt;
               nxt = temp;
                
            }

        }
        
        return curr;
    }
}
