class Solution {
    public int countWays(List<Integer> nums) {
        int sum = 0;
        int selected = 0;
        int n = nums.size();
        Collections.sort(nums);
        if(nums.get(0)!=0)
        {
            sum++;
        }
        for(int i=0;i<nums.size();i++)
        {
            selected++;
            if(selected>nums.get(i))
            {
                if(i+1<n && selected<nums.get(i+1))
                sum++;
                else if(i+1==n)
                sum++;
            }
        }
        return sum;
    }
}
