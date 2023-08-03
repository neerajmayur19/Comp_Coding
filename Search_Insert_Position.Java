class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        if(target<nums[0])
        return 0;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target && nums[mid-1]<target)
            return mid;
            else
            {
                if(nums[mid]<target)
                left = mid+1;
                else
                right = mid-1;
            }
        }
        if(target>nums[nums.length-1])
        return nums.length;
        return -1;
    }
}
