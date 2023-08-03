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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> t = new ArrayList<>();
        ListNode t1 = new ListNode();
        ListNode temp = head;
        while(temp != null)
        {
            t.add(temp.val);
            temp = temp.next;
        }
        for(int i=0;(i+k)<=t.size();i=i+k)
        {
            int left = i;
            int right = (i+k);
            right--;
            while(left<right)
            {
                Collections.swap(t,left,right);
                left++;
                right--;
            }
        }
        for(int i=t.size()-1;i>=0;i--)
        {
            ListNode t2 = new ListNode(t.get(i),t1.next);
            t1.next = t2;
        }
        return t1.next;
    }
}
