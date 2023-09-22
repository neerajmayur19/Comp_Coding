/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> ans = new HashMap<>();
        Node temp = head;
        while(temp != null)
        {
            ans.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        temp = head;

        while(temp != null)
        {
            Node temporary = ans.get(temp);
            temporary.next = ans.get(temp.next);
            temporary.random = ans.get(temp.random);
            temp = temp.next;
        }
        return ans.get(head);
    }
}
