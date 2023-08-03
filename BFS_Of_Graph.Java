

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> lst = new LinkedList<>();
        lst.add(0);
        vis[0] = true;
        while(!(lst.isEmpty()))
        {
            int val = lst.remove();
            ans.add(val);
            
            for(Integer n:adj.get(val))
            {
                if(vis[n]==false)
                {
                    vis[n] = true;
                    lst.add(n);
                }
            }
        }
        return ans;
    }
}
