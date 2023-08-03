class Solution {
    public int search(int[] nums, int target) {
        // Makes use of the assumption that, if you split an array into two parts at any time, one part will be sorted and another will be unsorted(left/right).
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while(left<=right)
        {
            mid = left + (right-left)/2;
            if(nums[mid]==target)
            return mid;
            if(nums[mid]>=nums[left]) // Checks for left part of the array before mid
            {
                if(nums[mid]>=target && nums[left]<=target)
                right = mid-1;
                else
                left = mid+1;
            }
            else
            // Checks for the right part of the array after mid part.
            {
                if(nums[mid]<=target && nums[right]>=target)
                left = mid+1;
                else
                right = mid-1;
            }
        }
        return -1;
    }
}
