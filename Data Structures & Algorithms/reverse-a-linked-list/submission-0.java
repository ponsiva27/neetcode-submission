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
        
        if(head==null) {
            return head;
        }

        ListNode start =head;
        ListNode tail =head;
        ListNode rev=null;

        while(start!=null) {
            start = start.next;
            tail.next = rev;
            rev=tail;
            tail=start;
        }
        return rev;
    }
}
