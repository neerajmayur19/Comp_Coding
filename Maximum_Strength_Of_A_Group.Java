class Solution {
    public long maxStrength(int[] nums) {
        long[] product = new long[1];
        product[0] = Integer.MIN_VALUE;
        max_product(0,nums,1,product);
        Arrays.sort(nums);
        if(nums[nums.length-1]>1 || product[0]>1)
        return product[0];
        else
        return nums[nums.length-1];
    }
    public void max_product(int index,int[] nums,long pro, long[] product)
    {
        if(index==nums.length)
        {
            product[0] = Math.max(pro,product[0]);
        }
        if(index<nums.length)
        {
        max_product(index+1,nums,pro*nums[index],product);
        max_product(index+1,nums,pro,product);
        }
    }
}
