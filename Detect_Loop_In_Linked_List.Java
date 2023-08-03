

//User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        HashSet<Node> t = new HashSet<Node>();
        while(head != null)
        {
            if(t.contains(head))
            return true;
            t.add(head);
            head = head.next;
        }
        return false;
    }
}
