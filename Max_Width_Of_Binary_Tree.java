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
class LevelNodes {
    TreeNode node;
    int level;
    LevelNodes(TreeNode node, int level)
    {
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        int first = 0, last = 0;
        Queue<LevelNodes> queue = new LinkedList<LevelNodes>();
        int ans = Integer.MIN_VALUE;
        queue.offer(new LevelNodes(root,0));
        while(!(queue.isEmpty()))
        {
            int size = queue.size();
            int mmin = queue.peek().level;
            for(int i=0;i<size;i++)
            {
                int current = queue.peek().level - mmin;
                TreeNode cur = queue.peek().node;
                queue.poll();
                if(i==0) 
                first = current;
                if(i==(size-1))
                last = current;
                if(cur.left != null)
                queue.offer(new LevelNodes(cur.left,2*current+1));
                if(cur.right != null)
                queue.offer(new LevelNodes(cur.right,2*current+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}
