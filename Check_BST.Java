/User function Template for Java


public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here
        return (BST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
    boolean BST(Node root, int min, int max)
        {
            if(root == null)
            {
                return true;
            }
            else if((root.data <= max) && (root.data >= min) && BST(root.left,min,root.data) && BST(root.right,root.data, max))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
}
