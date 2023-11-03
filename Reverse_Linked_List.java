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
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode forward = head.next;
        while(forward != null)
        {
            current.next = previous;
            previous = current;
            current = forward;
            forward = forward.next;
        }
        current.next = previous;
        return current;
    }
}
