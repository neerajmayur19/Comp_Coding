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
    public ListNode mergeKLists(ListNode[] lists) {
        int[] freq = new int[100000];
        ListNode t1 = new ListNode();
        for(int i=0;i<lists.length;i++)
        {
            while(lists[i]!=null)
            {
                freq[lists[i].val]++;
            }
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
            {
                while(freq[i]==0)
                {
                    freq[i]--;
                    ListNode t2 = new ListNode(freq[i],t1.next);
                    t1.next = t2;
                }
            }
        }
        return t1.next;
    }
}
