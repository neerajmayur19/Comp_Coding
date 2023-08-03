class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(Math.abs(nums[i]-nums[i-1]) <diff)
            {
                diff = Math.abs(nums[i]-nums[i-1]);
            }
        }
        return diff;
    }
}
