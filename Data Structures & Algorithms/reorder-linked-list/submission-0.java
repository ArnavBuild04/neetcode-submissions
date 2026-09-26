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
    public void reorderList(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = null;
        if(slow.next != null){
            rev = reverse(slow.next);
        }
        slow.next = null;

        ListNode dummy = new ListNode(-1,null);
        ListNode temp = dummy;
        int dir = 1;
        
        while(head != null && rev != null){
            
            if(dir % 2 != 0){
                ListNode temp2 = head.next;
                temp.next = head;
                temp = head;
                head = temp2;
            }
            else{
                ListNode temp2 = rev.next;
                temp.next = rev;
                temp = rev;
                rev = temp2;
            }
            
            dir++;
        }

        if(rev != null){
            temp.next = rev;
        }

        if(head != null){
            temp.next = head;
        }
        
        head = dummy.next;
        
        return;
    }

    public ListNode reverse(ListNode head){
        
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null ){
           
           ListNode temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;

        }
  
        return prev;
    }
}
