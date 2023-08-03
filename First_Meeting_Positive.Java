class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean stat = false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                stat = true;
                break;
            }
        }
        if(stat == false)
        return 1;
        if(nums.length==1)
        return 2;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=0 || nums[i]>nums.length)
            nums[i] = 1;
        }
        for(int i=0;i<nums.length;i++)
        {
            int x = Math.abs(nums[i]);
            if(nums[x-1]>0)
            nums[x-1] *= -1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            return (i+1);
        }
        return (nums.length+1);
    }
}
