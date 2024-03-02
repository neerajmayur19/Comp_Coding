/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> answer = new ArrayList<>();
        Queue<TreeNode> answer_nodes = new LinkedList<>();
        Queue<TreeNode> pq = new LinkedList<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        findParents(root,parent,pq);
        Set<TreeNode> visited = new HashSet<>();
        int distance = 0;
        answer_nodes.offer(target);
        visited.add(target);
        while(!(answer_nodes.isEmpty()))
        {
            int limit = answer_nodes.size();
            if(distance==k)
            break;
            distance++;
            for(int i=0;i<limit;i++)
            {
                TreeNode temp = answer_nodes.poll();
                if(temp.left != null && !(visited.contains(temp.left)))
                {
                    answer_nodes.offer(temp.left);
                    visited.add(temp.left);
                }
                if(temp.right != null && !(visited.contains(temp.right)))
                {
                    answer_nodes.offer(temp.right);
                    visited.add(temp.right);
                }
                if(parent.get(temp) != null && !(visited.contains(parent.get(temp))))
                {
                    answer_nodes.offer(parent.get(temp));
                    visited.add(parent.get(temp));
                }
            }
        }
        while(!(answer_nodes.isEmpty()))
        {
            TreeNode node = answer_nodes.poll();
            answer.add(node.val);
        }
        return answer;
    }
    public void findParents(TreeNode root, Map<TreeNode,TreeNode> parent, Queue<TreeNode> pq)
    {
        pq.offer(root);
        while(!(pq.isEmpty()))
        {
            TreeNode temp = pq.poll();
            if(temp.left != null)
            {
                pq.offer(temp.left);
                parent.put(temp.left,temp);
            }
            if(temp.right != null)
            {
                pq.offer(temp.right);
                parent.put(temp.right,temp);
            }
        }
    }
}
