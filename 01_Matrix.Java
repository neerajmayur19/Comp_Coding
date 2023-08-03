class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] vis = new int[m][n];
        int[][] distance = new int[m][n];
        Queue<Node> queue = new LinkedList<Node>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j] == 0)
                {
                    queue.add(new Node(i,j,0));
                    vis[i][j] = 1;
                }
            }
        }

        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};

        while(!(queue.isEmpty()))
        {
           int row = queue.peek().first;
           int col = queue.peek().second;
           int d = queue.peek().third;

           queue.remove();

           for(int i=0;i<4;i++)
           {
               int nrow = row + drow[i];
               int ncol = col + dcol[i];

               if(nrow >= 0 && nrow < m && ncol >=0 && ncol < n && vis[nrow][ncol]==0)
               {
                   vis[nrow][ncol] = 1;
                   distance[nrow][ncol] = d+1;
                   queue.add(new Node(nrow,ncol,d+1));
               }
           }
        }
        return distance;
    }
}
class Node
{
    int first,second,third;
    Node(int f,int s,int t)
    {
        this.first = f;
        this.second = s;
        this.third = t;
    }
}
