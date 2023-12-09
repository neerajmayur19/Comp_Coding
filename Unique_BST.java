class Solution {
    public int numTrees(int n) {
        //Catalan Number is the way to answer this question
        // This is the Recursive + DP(Memoization) approach
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    public int solve(int n,int[] dp)
    {
        if(n<=1)
        return 1;

        if(dp[n] != -1)
        return dp[n];
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            count += solve(i-1,dp) * solve(n-i,dp);
        }
        return dp[n] = count;
    }
    //This is the Top-Down Approach of DP.
}
