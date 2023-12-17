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
        ListNode prev = head;
        int length = 0;
        while(temp != null)
        {
            length++;
            prev = temp;
            temp = temp.next;
        }
        if(head==null || head.next==null || k==0 || (k%length)==0)
        return head;
        prev.next = head;
        k = k%length;
        k = length-k;
        k--;
        //To calculate the first half of the linked list
        while(k>0)
        {
            head = head.next;
            k--;
        }
        ListNode answer = head.next;
        head.next = null;
        return answer;
    }
}
