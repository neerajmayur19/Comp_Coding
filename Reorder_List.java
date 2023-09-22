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
    public void reorderList(ListNode head) {
        HashMap<Integer, ListNode> mapping = new HashMap<>();
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            mapping.put(count,temp);
            temp = temp.next;
            count++;
        }
        count--;
        int i = 1, j = count;
        temp = head;
        while(i<=(count/2) && j>(count/2))
        {
            temp.next = mapping.get(j);
            temp = temp.next;
            temp.next = mapping.get(i);
            temp = temp.next;
            j--;
            i++;
        }
        while(i<=(count/2))
        {
            temp.next = mapping.get(i);
            temp = temp.next;
            i++;
        }
        while(j>(count/2))
        {
            temp.next = mapping.get(j);
            temp = temp.next;
            j--;
        }
        temp.next = null;
    }
}
