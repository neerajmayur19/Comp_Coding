

//User function Template for Java


/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> t = new ArrayList<Integer>();
        right(node,t,0);
        return t;
    }
    public void right(Node node, ArrayList<Integer> t, int level)
    {
        if(node == null)
        return;
        if(t.size() == level)
        {
            t.add(node.data);
        }
        right(node.right,t,level+1);
        right(node.left,t,level+1);
    }
}
