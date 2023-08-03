class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int[] dp = new int[nums.length+1];
        int[] dp1 = new int[nums.length+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i] = -1;
        }
        for(int i=0;i<dp.length;i++)
        {
            dp1[i] = -1;
        }
        int sol1 = solve1(nums.length-2,nums,dp);
        int sol2 = solve2(nums.length-1,nums,dp1);
        return Math.max(sol1,sol2);
    }
    public int solve1(int index, int[] nums, int[] dp)
    {
        if(index==0)
        {
            return nums[0];
        }
        if(index<0)
        return 0;
        if(dp[index]!=-1)
        return dp[index];
        int pick = nums[index] + solve1(index-2,nums,dp);
        int npick = 0 + solve1(index-1,nums,dp);
        return dp[index] = Math.max(pick,npick); 
    }
    public int solve2(int index, int[] nums, int[] dp)
    {
        if(index==1)
        {
            return nums[1];
        }
        if(index<=0)
        return 0;
        if(dp[index]!=-1)
        return dp[index];
        int pick = nums[index] + solve2(index-2,nums,dp);
        int npick = 0 + solve2(index-1,nums,dp);
        return dp[index] = Math.max(pick,npick); 
    }
}
