class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                range[0] = i;
                k++;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i] == target && i!=range[0])
            {
                range[1] = i;
                k++;
                break;
            }
        }
        if(k==0)
        {
            range[0] = -1;
            range[1] = -1;
        }
        else if(k==1)
        {
            range[1] = range[0];
        }
        return range;
    }
}
