class Solution {
    public void sortColors(int[] nums) {
        // Use Dutch National Flag algorithm as the most optimized solution
        int[] freq = new int[3];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        int k = 0;
        for(int i=0;i<3;i++)
        {
            while(freq[i]!=0)
            {
                nums[k] = i;
                k++;
                freq[i]--;
            }
        }
    }
}
