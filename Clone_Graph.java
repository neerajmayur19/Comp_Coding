/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> answer = new HashMap<>();
        if(node != null)
        {
            answer.put(node, new Node(node.val));
            dfs(node,answer);
            return answer.get(node);
        }
        return null;
    }
    public void dfs(Node node, HashMap<Node,Node> answer)
    {
        for(Node nd: node.neighbors)
        {
            if(!(answer.containsKey(nd)))
            answer.put(nd, new Node(nd.val));
            answer.get(node).neighbors.add(answer.get(nd));
        }
        for(Node nd: node.neighbors)
        {
            if(answer.get(nd) != null && answer.get(nd).neighbors.size()==0)
            dfs(nd,answer);
        }
    }
}
