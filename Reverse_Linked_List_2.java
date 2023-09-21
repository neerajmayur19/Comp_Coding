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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next == null || left==right)
        {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode dummy1;
        dummy.next = head;
        dummy1 = dummy;
        ListNode temp = head;
        int left_prev = 1;
        int right_prev = 1;
        while(left_prev < left)
        {
            dummy = dummy.next;
            left_prev++;
        }
        ListNode left_node = dummy;
        temp = head;
        // Reversing the List starts from here by making use of current and previous pointers
        ListNode current = left_node.next;
        int count = left;
        ListNode prev = null;
        while(count <= right && current != null)
        {
            ListNode temporary = current.next;
            current.next = prev;
            prev = current;
            current = temporary;
            count++;
        }
        left_node.next = prev;
        ListNode prev1 = null;
        while(left_node != null)
        {
            prev1 = left_node;
            left_node = left_node.next;
        }
        prev1.next = current;
        return dummy1.next;
    }
}
