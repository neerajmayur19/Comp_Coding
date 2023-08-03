

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V+1];
        DFS(adj,ans,vis,0);
        return ans;
        }
        public void DFS( ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ans, boolean[] visited,int vertex)
        {
            visited[vertex] = true;
            ans.add(vertex);
            for(Integer n: adj.get(vertex))
            {
                if(visited[n]==false)
                {
                    DFS(adj,ans,visited,n);
                }
            }
        }
}
