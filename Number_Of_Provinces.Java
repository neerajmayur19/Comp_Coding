class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected[0].length;j++)
            {
                if(isConnected[i][j]==1)
                {
                    if(!(graph.get(i).contains(j)))
                    graph.get(i).add(j);
                    if(!(graph.get(j).contains(i)))
                    graph.get(j).add(i);
                }
            }
        }
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean[] vis = new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++)
        {
            if(vis[i]==false)
            {
                count++;
                DFS(i,ans,graph,vis);
            }
        }
        return count;
    }
    void DFS(int index,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj,boolean[] vis)
    {
        vis[index] = true;
        ans.add(index);
        for(Integer n: adj.get(index))
        {
            if(vis[n]==false)
            {
                DFS(n,ans,adj,vis);
            }
        }
    }
}
