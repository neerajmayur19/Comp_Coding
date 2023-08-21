class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++)
        {
            if(color[i]==-1)
            {
                q.add(i);
                if(BFS(color,q,graph)==false)
                return false;
            }
        }
        return true;
    }
    public boolean BFS(int[] color, Queue<Integer> q,int[][] graph)
    {
        while(!(q.isEmpty()))
        {
            int node = q.remove();
            for(int i=0;i<graph[node].length;i++)
            {
                int present = graph[node][i];
                if(color[present] != -1)
                {
                    if(color[present] != color[node])
                    {
                        continue;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(color[node]==0)
                    {
                        color[present] = 1;
                    }
                    else
                    {
                        color[present] = 0;
                    }
                    q.add(present);
                }
            }
        }
        return true;
    }
}
