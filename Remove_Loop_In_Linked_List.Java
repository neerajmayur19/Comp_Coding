

/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> t = new HashSet<Node>();
        Node prev = null;
        while(head != null)
        {
            if(t.contains(head))
            {
                break;
            }
            t.add(head);
            prev = head;
            head = head.next;
        }
        head = prev;
        head.next = null;
    }
}
