

/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node temp = head;
    	int count = 0;
    	while(temp != null)
    	{
    	    temp = temp.next;
    	    count++;
    	}
    	count = count - n - 1;
    	int i=0;
    	while(i <= count)
    	{
    	    head = head.next;
    	    i++;
    	}
    	if(count >= -1)
    	return head.data;
    	else
    	return -1;
    }
}
