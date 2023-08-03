class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i] = -1;
        }
        /*
        return(solve(nums.length-1,nums,dp));*/
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int npick = 0 + dp[i-1];
            int pick = nums[i];
            if(i>1)
            pick = dp[i-2] + nums[i];
            dp[i] = Math.max(pick,npick);
        }
        return dp[nums.length-1];

    }
    // A Different way of implementing recursion
    /*public void solve(int index, int sum, int[] nums, int[] values)
    {
        if(index>=nums.length)
        {
            if(sum>values[0])
            values[0] = sum;
            return;
        }
        if(index<nums.length)
        solve(index+2,sum+nums[index],nums,values);
        solve(index+1,sum,nums,values);
    }*/
    // This is a way of implementing memoization
    /*public int solve(int index, int[] nums,int[] dp)
    {
        if(index==0)
        return nums[0];
        if(index<0)
        return 0;
        if(dp[index]!=-1)
        return dp[index];
        int pick = nums[index]+solve(index-2,nums,dp);
        int npick = 0 + solve(index-1,nums,dp);
        return dp[index] = Math.max(pick,npick);
    }*/
}
