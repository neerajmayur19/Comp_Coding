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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy_odd = new ListNode(-100);
        ListNode ans = dummy_odd;
        ListNode dummy_even = new ListNode(-200);
        ListNode ans1 = dummy_even;
        int clock = 1;
        ListNode temp = head;
        while(temp != null)
        {
            if(clock%2 != 0)
            {
                dummy_odd.next = temp;
                dummy_odd = dummy_odd.next;
            }
            else
            {
                dummy_even.next = temp;
                dummy_even = dummy_even.next;
            }
            clock++;
            temp = temp.next;
        }
        dummy_odd.next = ans1.next;
        dummy_even.next = null;
        return ans.next;
    }
}
