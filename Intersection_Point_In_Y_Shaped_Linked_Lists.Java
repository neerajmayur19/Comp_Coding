

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int data = -1;
         HashSet<Node> h = new HashSet<Node>();
         while(head1 != null)
         {
             h.add(head1);
             head1 = head1.next;
         }
         while(head2 != null)
         {
             if(h.contains(head2))
             {
                 data = head2.data;
                 break;
             }
             head2 = head2.next;
         }
         return data;
	}
}
