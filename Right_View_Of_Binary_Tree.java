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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        int current_depth = 0;
        findRightView(root,answer,current_depth);
        return answer;
    }
    public void findRightView(TreeNode root,List<Integer> answer,int current_depth)
    {
        if(root==null)
        return;

        if(answer.size()==current_depth)
        answer.add(root.val);

        findRightView(root.right,answer,current_depth+1);
        findRightView(root.left,answer,current_depth+1);
    }
}
