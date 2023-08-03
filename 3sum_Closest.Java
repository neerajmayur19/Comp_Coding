class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left,right;
        int sum = 0;
        int tsum = nums[0] + nums[1] + nums[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            left = i+1;
            right = nums.length-1;
            while(left<right)
            {
                sum = nums[i] + nums[left] + nums[right];
                if(sum<target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
                if(Math.abs(sum-target)<Math.abs(tsum-target))
                {
                    tsum = sum;
                }
            }
        }
        return tsum;
    }
}
