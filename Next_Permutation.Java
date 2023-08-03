class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1)
        return;
        int i = 1;
        int peak = -1; // Stores the index of the peak value of the leftmost element 
        while(i<nums.length)
        {
            if(nums[i]>nums[i-1])
            {
                peak = i;
            }
            i++;
        }
        if(peak == -1) // If the array is in descending order, this helps in sorting the array and returning the array.
        {
            Arrays.sort(nums);
            return;
        }
            int value = nums[peak];
            int index = peak;
            for(int j=peak;j<nums.length;j++)
            {
                if(nums[j]>nums[peak-1] && nums[j]<nums[index]) // Checks for any value in between the peak and its previous value.
                index = j;
            }
            swap(nums,peak-1,index);
            Arrays.sort(nums,peak,nums.length); // sorts only the subarray part of the original array.
    }
    public void swap(int[] nums, int l, int r)
    {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
