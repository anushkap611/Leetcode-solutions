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
        if(head == null) {
            head = null;
        }
        else {
            int length = 0;
            ListNode trav = head;
            while(trav!=null) {
                length++;
                trav = trav.next;
            }
            int pos = length - n + 1;
            if(pos == 1) {
                return head.next;
            }
            trav = head;
            for(int i = 1; i<pos-1; i++) {
                trav = trav.next;
            }
            trav.next = trav.next.next;
        }
        return head;
    }
}