

//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> t = new ArrayList<Integer>();
      left(root,t,0);
      return t;
      
    }
    public void left(Node root, ArrayList<Integer> t, int level)
    {
        int count = 0;
        if(root == null)
        return;
        if(t.size() == level)
        {
            t.add(root.data);
        }
        left(root.left,t,level+1);
        left(root.right,t,level+1);
    }
}
