/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // This is Floyd's Algorithm to detect any cycles in Linked list using 2 pointers method, fast and slow where slow is incremented by 1 place each time and fast by 2 and at any point if(fast ==slow), then a cycle is present.
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
    }
}
