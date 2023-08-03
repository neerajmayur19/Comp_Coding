

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node temp = head;
         int count = 0;
         while(temp != null)
         {
             count++;
             temp = temp.next;
         }
         count = count/2 + 1;
         int k=1;
         while(k<count)
         {
             k++;
             head = head.next;
         }
         int d = head.data;
         return d;
    }
}
