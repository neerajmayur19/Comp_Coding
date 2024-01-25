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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> linkedlist = new LinkedList<TreeNode>();
        int count = 0;
        if(root==null)
        return ans;
        linkedlist.offer(root);
        while(!(linkedlist.isEmpty()))
        {
            int size = linkedlist.size();
            List<Integer> temporary_ans = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                if(linkedlist.peek().left != null)
                linkedlist.offer(linkedlist.peek().left);
                if(linkedlist.peek().right != null)
                linkedlist.offer(linkedlist.peek().right);
                temporary_ans.add(linkedlist.poll().val);
            }
            if(count%2!=0)
            Collections.reverse(temporary_ans);
            count++;
            ans.add(temporary_ans);
        }
        return ans;
    }
}
