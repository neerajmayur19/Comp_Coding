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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = null;
        while(list1 != null && list2 != null)
        {
            if(list1.val > list2.val)
            {
                ListNode temp1.val = list1.val;
                temp1.next = null;
                list1 = list1.next;
                temp.next = temp1;
            }
        }
    }
}
