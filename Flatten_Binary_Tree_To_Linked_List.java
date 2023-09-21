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
    TreeNode prev;
    public void flatten(TreeNode root) {
        TreeNode prev = null;
        Preorder(root);
    }
    public void Preorder(TreeNode current)
    {
        if(current == null)
        {
            return;
        }
        if(prev != null)
        {
            prev.left = null;
            prev.right = current;
        }
        TreeNode right = current.right;
        prev = current;
        Preorder(current.left);
        Preorder(right);
    }
}
