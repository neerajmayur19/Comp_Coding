class Solution {
    public int findDuplicate(int[] nums) {
        // The list is beign traversed only once
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            if(nums[i]<0)
            {
                temp = nums[i]*-1;
            }
            if(nums[temp]<0)
            {
                return Math.max(nums[i],nums[i]*-1);
            }
            else
            {
                nums[temp] *= -1;
            }
        }
        return 0;
    }
}
