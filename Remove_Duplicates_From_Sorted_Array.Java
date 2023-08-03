class Solution {
    public int removeDuplicates(int[] nums) {
        int[] n = new int[nums.length];
        int k = 1;
        n[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            continue;
            else
            {
                n[k] = nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++)
        {
            nums[i] = n[i];
        }
        return k;
    }
}
