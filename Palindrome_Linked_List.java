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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true;
        }
        int length = getLength(head);
        ListNode mid = getMid(head);
        ListNode second_half = mid.next;
        mid.next = null;
        ListNode Reverse = getReverse(head);
        if(length%2 != 0)
        {
            second_half = second_half.next;
        }
        while(Reverse != null && second_half != null)
        {
            if(Reverse.val!=second_half.val)
            return false;
            Reverse = Reverse.next;
            second_half = second_half.next;
        }
        return true;
    }
    public ListNode getMid(ListNode head)
    {
        ListNode temp = head;
        int length = 0;
        while(temp != null)
        {
            temp = temp.next;
            length++;
        }
        temp = head;
        int i = 1;
        while(i<(length/2))
        {
            i++;
            temp = temp.next;
        }
        return temp;
    }
    public int getLength(ListNode head)
    {
        ListNode temp = head;
        int length = 0;
        while(temp != null)
        {
            temp = temp.next;
            length++;
        }
        return length;
    }
    public ListNode getReverse(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode forward = head.next;
        while(forward != null)
        {
            current.next = prev;
            prev = current;
            current = forward;
            forward = forward.next;
        }
        current.next = prev;
        return current;
    }
}
