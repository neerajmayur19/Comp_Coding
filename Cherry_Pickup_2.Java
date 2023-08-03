class Solution {
    public int cherryPickup(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][][] dp = new int[r][c][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<c;k++)
                {
                    dp[i][j][k] = -1;
                }
            }
        }
        return solve(0,0,c-1,r,c,grid,dp);
    }
    public int solve(int i, int j1, int j2, int r, int c,int[][] grid,int[][][] dp)
    {
        if(j1<0 || j2<0 || j1>=c || j2>=c)
        {
            return -1234556;
        }
        if(i==(r-1))
        {
            if(j1==j2)
            return grid[i][j1];
            else
            return grid[i][j1] + grid[i][j2];
        }
        if(dp[i][j1][j2] != -1)
        return dp[i][j1][j2];
        // Explore all paths
        int maxi = -1234556;
        for(int dj1 = -1; dj1 <= 1;dj1++)
        {
            for(int dj2 = -1;dj2<=1;dj2++)
            {
                int value = 0;
                if(j1==j2) 
                value = grid[i][j1];
                else
                value = grid[i][j1] + grid[i][j2];
                value += solve(i+1,j1+dj1,j2+dj2,r,c,grid,dp);
                maxi = Math.max(value,maxi);
            }
        }
        return dp[i][j1][j2] = maxi;
    }
}
