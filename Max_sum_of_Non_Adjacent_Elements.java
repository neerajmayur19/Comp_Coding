class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        return sum(nums,dp);
    }
    public int sum(int[] nums, int[] dp)
    {
        dp[0] = nums[0];
        if(nums.length==1)
        return dp[0];
        else
        {
            dp[1] = Math.max(dp[0],nums[1]);
            for(int i=2;i<nums.length;i++)
            {
                dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
            }
        }
        return dp[nums.length-1];
    }
}
