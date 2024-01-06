class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        int[] dp = new int[10001];
        Arrays.fill(dp,-1);
        if(x<=y)
        return y-x;
        return solve(dp,x,y);
    }
    public int solve(int[] dp,int x,int y)
    {
        if(x<=y)
        return Math.abs(x-y);
        if(x<=0)
        return Integer.MAX_VALUE;
        if(dp[x] != -1)
        return dp[x];
        int d11 = Integer.MAX_VALUE, d5 = Integer.MAX_VALUE;
        if(x%5==0)
        {
            d5 = 1+solve(dp,x/5,y);
        }
        else
        {
            int temporary = x + (5-(x%5));
            d5 = (temporary-x) + 1+ solve(dp,temporary/5,y);
        }
        if(x%11==0)
        {
            d11 = 1+solve(dp,x/11,y);
        }
        else
        {
            int temporary = x + (11-(x%11));
            d11 = (temporary-x) + 1+ solve(dp,temporary/11,y);
        }
        int d1 = 1 + solve(dp,x-1,y);
        return dp[x] = Math.min(d11,Math.min(d5,d1));
    }
}
