 class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int[][] vis = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==0)
                {
                    BFS(i,j,vis,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void BFS(int row,int col,int[][] vis,char[][] grid)
    {
        vis[row][col] = 1;
        if(col+1 < grid[0].length && grid[row][col+1]=='1' && vis[row][col+1]==0) // Right
        {
            BFS(row,col+1,vis,grid);
        }
        if(row+1 < grid.length && grid[row+1][col]=='1' && vis[row+1][col]==0) //Down
        {
            BFS(row+1,col,vis,grid);
        }
        if(col-1 >= 0 && grid[row][col-1]=='1' && vis[row][col-1]==0)//Left
        {
            BFS(row,col-1,vis,grid);
        }
        if(row-1 >= 0 && grid[row-1][col]=='1' && vis[row-1][col]==0)//Up
        {
            BFS(row-1,col,vis,grid);
        }
    }
}
