class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<word1.length()+1;i++)
        {
            for(int j=0;j<word2.length()+1;j++)
            {
                dp[i][j] = -1;
            }
        }
        return compute(word1,word2,word1.length(),word2.length(),dp);
    }
    public int compute(String word1,String word2,int m,int n,int[][] dp)
    {
        if(dp[m][n] != -1)
        return dp[m][n];
        if(m==0)
        {
            return dp[m][n] = n;
        }
        if(n==0)
        {
            return dp[m][n] = m;
        }
        if(word1.charAt(m-1)==word2.charAt(n-1))
        dp[m][n] = compute(word1,word2,m-1,n-1,dp);
        else
        {
            int insertion = compute(word1,word2,m,n-1,dp);
            int delete = compute(word1,word2,m-1,n,dp);
            int replace = compute(word1,word2,m-1,n-1,dp);
            dp[m][n] = (1 + Math.min(insertion,Math.min(delete,replace)));
        }
        return dp[m][n];
    }
}
