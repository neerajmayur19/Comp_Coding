class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int count = 0;
        int clock = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]<=threshold)
            {
                clock = 1;
                count = 1;
                for(int j=i+1;j<nums.length;j++)
                {
                    if(clock%2!=0 && nums[j]%2!=0 && nums[j]<=threshold)
                    {
                        clock++;
                        count++;
                    }
                    else if(clock%2==0 && nums[j]%2==0 && nums[j]<=threshold)
                    {
                        clock++;
                        count++;
                    }
                    else
                    {
                        break;
                    }
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
