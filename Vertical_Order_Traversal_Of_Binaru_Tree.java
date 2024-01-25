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
class Tuple
{
    TreeNode node;
    int x;
    int y;
    Tuple(TreeNode node, int x, int y)
    {
        this.node = node;
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tuple> linkedlist = new LinkedList<Tuple>();
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
        return ans;
        linkedlist.offer(new Tuple(root,0,0));
        while(!(linkedlist.isEmpty()))
        {
            Tuple current = linkedlist.poll();
            TreeNode node = current.node;
            int data = current.node.val;
            int x = current.x;
            int y = current.y;

            if(!(map.containsKey(x)))
            {
                map.put(x,new TreeMap<>());
            }
            if(!(map.get(x).containsKey(y)))
            {
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(data);

            if(node.left != null)
            {
                linkedlist.offer(new Tuple(node.left,x-1,y+1));
            }
            if(node.right != null)
            {
                linkedlist.offer(new Tuple(node.right,x+1,y+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> i : map.values())
        {
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> m : i.values())
            {
                while(!(m.isEmpty()))
                ans.get(ans.size()-1).add(m.poll());
            }
        }
        return ans;
    }
}
