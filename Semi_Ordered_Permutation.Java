class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int start_index = find1(nums);
        int count = 0;
        if(start_index!=0)
        {
            for(int i=start_index;i>0;i--)
            {
                swap(nums,i,i-1);
                count++;
            }
        }
        int final_index = findn(nums);
        if(final_index!=(nums.length-1))
        {
            for(int j=final_index;j<(nums.length-1);j++)
            {
                swap(nums,j,j+1);
                count++;
            }
        }
        return count;
    }
    public int find1(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                return i;
        }
        return -1;
    }
    public int findn(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums.length)
                return i;
        }
        return -1;
    }
    public void swap(int[] nums,int left, int right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
