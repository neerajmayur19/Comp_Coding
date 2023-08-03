class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> t = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        int sum = 0;
        int left,right;
        for(int i=0;i<nums.length;i++)
        {
            left = i+1;
            right = nums.length-1;
            while(left<right)
            {
                sum = nums[i] + nums[left] + nums[right];
                if(sum==0)
                {
                    s.add(Arrays.asList(nums[i],nums[left],nums[right]);
                    left++;
                    right--;
                }
                else if(sum>0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        t.addAll(s);
        return t;
    }
}
