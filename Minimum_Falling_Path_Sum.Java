class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int j=0;j<n;j++)
        {
            dp[0][j] = matrix[0][j];
        }  
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int down = matrix[i][j] + dp[i-1][j];
                int lg = matrix[i][j];
                if(j>0)
                lg += dp[i-1][j-1];
                else
                lg += 2000000;
                int rg = matrix[i][j];
                if(j<n-1)
                {
                    rg += dp[i-1][j+1];
                }
                else
                rg += 2000000;
                dp[i][j] = Math.min(down,Math.min(lg,rg));
            }
        }
        int maxi = Integer.MAX_VALUE;
        for(int j=0;j<n;j++)
        {
            maxi = Math.min(maxi,dp[n-1][j]);
        }
        return maxi;
    }
}
