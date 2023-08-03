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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++; // Stores the no. of elements in the linked list
        }
        if(count<=1)
        {
            return head;
        }
        k = k%count; // Stores the actual number of rotations by eliminating the perfect cycles
        while(k>0)
        {
        ListNode temp1 = head;
        ListNode temp2 = null;
        while(temp1.next != null)
        {
            temp2 = temp1; // Stores the penultimate node
            temp1 = temp1.next; // Stores the last node of the linked list
        }
        temp1.next = head; // Points the last node to the head
        temp2.next = null; // Points the last but one node to the null
        head = temp1;
        k--;
        }
        return head;
    }
}
