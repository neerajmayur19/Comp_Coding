/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        return null;
        if(root.val==key)
        return helper(root);
        else
        {
            TreeNode dummy = root;
            while(root != null)
            {
                if(root.val>key)
                {
                    if(root.left != null && root.left.val==key)
                    root.left = helper(root.left);
                    else
                    root = root.left;
                }
                else
                {
                    if(root.right != null && root.right.val==key)
                    root.right = helper(root.right);
                    else
                    root = root.right;
                }
            }
            return dummy;
        }
    }
    public TreeNode helper(TreeNode root)
    {
        if(root.left == null)
        return root.right;
        else if(root.right==null)
        return root.left;
        else
        {
            TreeNode temp_right = root.right;
            TreeNode node = FindRight(root.left);
            node.right = temp_right;
            return root.left;
        }
    }
    public TreeNode FindRight(TreeNode root)
    {
        while(root.right != null)
        {
            root = root.right;
        }
        return root;
    }
}
