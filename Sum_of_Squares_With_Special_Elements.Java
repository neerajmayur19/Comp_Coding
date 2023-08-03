class Solution {
    public int sumOfSquares(int[] nums) {
        int value = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums.length%(i+1)==0)
            {
                value += nums[i]*nums[i];
            }
        }
        return value;
    }
}
