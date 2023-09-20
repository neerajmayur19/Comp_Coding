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
    public ListNode partition(ListNode head, int x) {
        ListNode pointer1 = new ListNode(-1);
        ListNode pointer2 = new ListNode(-1);
        ListNode smaller = pointer1;
        ListNode larger = pointer2;
        ListNode temp = head;
        while(temp != null)
        {
            if(temp.val < x)
            {
                smaller.next = temp;
                smaller = smaller.next;
            }
            if(temp.val >= x)
            {
                larger.next = temp;
                larger = larger.next;
            }
            temp = temp.next;
        }
        smaller.next = pointer2.next;
        larger.next = null;
        return pointer1.next;
        
    }
}
