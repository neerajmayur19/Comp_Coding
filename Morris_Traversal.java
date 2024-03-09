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
    public List<Integer> inorderTraversal(TreeNode root) {
        //This Makes use of Morris Traversal having TC of O(N) and SC of O(1)
        List<Integer> Inorder = new ArrayList<>();
        TreeNode temp = root;
        while(temp != null)
        {
            if(temp.left == null)
            {
                Inorder.add(temp.val);
                temp = temp.right;
            }
            else
            {
                TreeNode prev = temp.left;
                while(prev.right != null && prev.right != temp)
                {
                    prev = prev.right;
                }
                if(prev.right==null)
                {
                    prev.right = temp;
                    temp = temp.left;
                }
                else
                {
                    prev.right=null;
                    Inorder.add(temp.val);
                    temp = temp.right;
                }
            }
        }
        return Inorder;
    }
}
