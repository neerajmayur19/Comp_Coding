class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();
        int[][] vis = new int[m][n];
        int fresh_oranges = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 2)
                {
                    queue.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                else
                {
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1)
                {
                    fresh_oranges++;
                }
            }
        }
        int converted_oranges = 0;
        int time = 0;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        while(!(queue.isEmpty()))
        {
            int r = queue.peek().row;
            int c = queue.peek().col;
            int t = queue.peek().time;
            time = Math.max(time,t);
            queue.remove();
            for(int i=0;i<4;i++)
            {
                int n_row = r + drow[i];
                int n_col = c + dcol[i];
                if(n_row>=0 && n_row<m && n_col>=0 && n_col<n && vis[n_row][n_col]==0 && grid[n_row][n_col]==1)
                {
                    queue.add(new Pair(n_row,n_col,t+1));
                    vis[n_row][n_col] = 2;
                    converted_oranges++;
                }
            }
        }
        if(converted_oranges != fresh_oranges)
        {
            return -1;
        }
        return time;
    }
}
class Pair
{
    int row;
    int col;
    int time;
    Pair(int r,int c,int t)
    {
        this.row = r;
        this.col = c;
        this.time = t;
    }
}
