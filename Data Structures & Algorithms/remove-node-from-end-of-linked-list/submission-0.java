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

        if(head==null) {
            return head;
        }

        ListNode fast=head;
        ListNode slow=head;

        for(int i=0;i<n;i++){
            fast=fast.next;  //Taking N steps ahead in fast 
        }
        
        if(fast==null) {   // checking if he reaches the end of the cliff after he completes the N step
            return head.next;  
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;     // both fast and slow traveling at same 1x speed until fast reaches the end. 
        }
        slow.next=slow.next.next; // now delete the nth node from the end of the linkedList.
        return head;   //return the linkdeList
    }
}
