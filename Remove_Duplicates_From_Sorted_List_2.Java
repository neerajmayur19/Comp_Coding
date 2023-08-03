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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        if(head==null)
        {
            return null;
        }
        int first = head.val;
        int val1 = first;
        ListNode temp = head;
        while(temp != null)
        {
            val1 = temp.val;
            if(frequency.containsKey(val1))
            {
                frequency.put(val1,frequency.get(val1)+1);
            }
            else
            {
                frequency.put(val1,1);
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null)
        {
            if(frequency.get(temp.val)==1)
            {
                prev.next = temp;
                prev = temp;
            }
            temp = temp.next;
        }
        if(prev.next != null)
        {
            prev.next = null;
        }
        return dummy.next;
    }
}
