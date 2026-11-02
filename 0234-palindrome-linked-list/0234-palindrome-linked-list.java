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
    public boolean isPalindrome(ListNode head) {
        Stack <Integer> st = new Stack<>();
        ListNode trav = head;
        while(trav != null) {
            st.push(trav.val);
            trav = trav.next;
        }
        trav = head;
        while(!st.isEmpty()) {
            if(trav.val != st.pop())
                return false;
            trav = trav.next;
        }
        return true;
    }
}