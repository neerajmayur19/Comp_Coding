

class Solution
{
    //Function to detect cycle using DSU in an undirected graph.
    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                if(DFS(i,-1,adj,vis))
                return 1;
            }
        }
        return 0;
    }
    public boolean DFS(int V, int predecessor, ArrayList<ArrayList<Integer>> adj, boolean[] vis)
    {
        vis[V] = true;
        for(Integer n: adj.get(V))
        {
            if(vis[n]==false)
            {
                if(DFS(n,V,adj,vis))
                return true;
            }
            else if(vis[n]==true && n==predecessor)
            {
                continue;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
