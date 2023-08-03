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
        ListNode temp = head;
        // A temporary linked list pointed to head to note down the length of the list.
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        // If the length is 1 and the head has to be removed, then an empty list is returned 
        if(count==1 && n==1)
        {
            return temp;
        }
        int value = (count-n)+1;
        // nth node from the last is (length-n)th node from the start
        System.out.println(value);
        ListNode prev = head;
        // A node to point to the previous node of the node to be removed
        int i = 1;
        if(value==1) // The case where has the head has to be removed
        {
            prev = head.next;
            return prev;
        }
        while(i<(value-1))
        {
            prev = prev.next;
            i++;
        }
        ListNode node = prev.next;
        if(prev.next != null && prev.next != head)
        {
        prev.next = node.next; // the node is deleted here.
        }
        else
        {
            prev = prev.next; // if the last node has to be deleted, this case pertains to that
            return prev;
        }
        return head;
    }
}
