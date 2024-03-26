class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp,-1);
        return combinations(nums,target,dp);
    }
    public int combinations(int[] nums, int target,int[] dp)
    {
        if(target==0)
        return 1;
        if(target<0)
        return 0;
        if(dp[target] != -1)
        return dp[target];
        int count = 0;
        for(int num:nums)
        count += combinations(nums,target-num,dp);
        return dp[target] = count;
    }
}
