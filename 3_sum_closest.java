class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_target = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                if(Math.abs((nums[i]+nums[j]+nums[k])-target)<Math.abs(closest_target-target))
                {
                    closest_target = nums[i]+nums[j]+nums[k];
                }
                if(nums[i]+nums[j]+nums[k]<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return closest_target;
    }
}
