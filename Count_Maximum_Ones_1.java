class Solution {
    public int longestOnes(int[] nums, int k) {
        //Sliding Window Approach
        int left = 0;
        int right = left;
        int max_positions = 0;
        while(left>=0 && left<nums.length && right>=0 && right<nums.length && left<=right)
        {
            if(right<nums.length && k==0 && nums[right]==1)
            right++;
            else if(right<nums.length && k==0 && nums[right]==0)
            {
                while(nums[left]!=0)
                left++;
                left++;
                right++;
            }
            else
            {
                if(right<nums.length && nums[right]==0)
                {
                    right++;
                    k--;
                }
                if(right<nums.length && nums[right]==1)
                {
                    right++;
                }
                if(k==0)
                {
                    max_positions = Math.max(max_positions,right-left);
                }
            }
            max_positions = Math.max(max_positions,right-left);
        }
        return max_positions;
    }
}
