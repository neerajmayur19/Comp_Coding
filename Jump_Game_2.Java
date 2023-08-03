class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(0,nums,0,dp);
    }
    public int solve(int index, int[] nums,int count,int[] dp)
    {
        if(index == (nums.length-1))
        {
            return 0;
        }
        if(dp[index] != -1)
        {
            return dp[index];
        }
        /*if(nums[index]==0)
        {
            return 99999;
        }*/
        int min = 99999;
        for(int i=1;i<=nums[index];i++)
        {
            if(index+i < nums.length)
            {
                int value = solve(index+i,nums,count,dp)+1;
                min = Math.min(min,value);
            }
        }
        return dp[index] = min;
    }
}
