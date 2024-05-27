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
    public int minDiffInBST(TreeNode root) {
        int[] diff = new int[1];
        diff[0] = Integer.MAX_VALUE;
        Diff(root,diff);
        return diff[0];
    }
    public void Diff(TreeNode root,int[] diff)
    {
        if(root != null)
        {
            if(root.left != null)
            {
                int maxine = findMax(root.left);
                diff[0] = Math.min(diff[0], Math.abs(root.val-maxine));
                Diff(root.left,diff);
            }
            if(root.right != null)
            {
                int minimum = findMin(root.right);
                diff[0] = Math.min(diff[0], Math.abs(root.val-minimum));
                Diff(root.right,diff);
            }
        }
    }
    public int findMax(TreeNode root)
    {
        int max_1 = Integer.MIN_VALUE;
        while(root  != null)
        {
            max_1 = Math.max(max_1,root.val);
            root = root.right;
        }
        return max_1;
    }
    public int findMin(TreeNode root)
    {
        int min_1 = Integer.MAX_VALUE;
        while(root  != null)
        {
            min_1 = Math.min(min_1,root.val);
            root = root.left;
        }
        return min_1;
    }
}
