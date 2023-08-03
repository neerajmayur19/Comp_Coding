class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j] = -1;
            }
        }
        return solve(m,triangle,dp);
    }
    public int solve(int m,List<List<Integer>> triangle, int[][] dp)
    {
        int left = Integer.MAX_VALUE;
        int dg = Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            for(int j=0; j<triangle.get(i).size();j++)
            {
                if(i==m-1)
                dp[i][j] = triangle.get(i).get(j);
                if(i>0)
                left = triangle.get(i).get(j) + dp[i-1][j];
                if(i>0 && j>0)
                dg = triangle.get(i).get(j) + dp[i-1][j-1];
                dp[i][j] = Math.min(left,dg);
            }
        }
        int maxi = Integer.MAX_VALUE;
        for(int k=0;k<triangle.get(m-1).size();k++)
        {
            maxi = Math.min(maxi,dp[m-1][k]);
        }
        return maxi;
    }
}
