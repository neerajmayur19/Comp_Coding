

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        boolean a = true;
        Node temp = head;
        Stack<Integer> s = new Stack<Integer>();
        int k = 0;
        while(temp != null)
        {
            s.push(temp.data);
            temp = temp.next;
        }
        while(head != null)
        {
            if(head.data == s.peek())
            {
                s.pop();
                head = head.next;
            }
            else
            {
                a = false;
                break;
            }
        }
       return a; 
    }    
}
