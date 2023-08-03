class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        if(sum%2 != 0)
        return false;
        sum /= 2;
        boolean[][] dp = new boolean[nums.length][sum+1];
        for(int i=0;i<nums.length;i++)
        {
            dp[i][0] = true;
        }
        if(nums[0]<=sum)
        dp[0][nums[0]] = true;
        for(int i=1;i<nums.length;i++)
        {
            for(int target=1;target<=sum;target++)
            {
                boolean npick = dp[i-1][target];
                boolean pick = false;
                if(nums[i]<=target)
                pick = dp[i-1][target-nums[i]];
                dp[i][target] = pick|npick;
            }
        }
        return dp[nums.length-1][sum];
    }
}
