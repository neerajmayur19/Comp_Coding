class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> answer = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            answer.add(nums[i]);
        }
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(answer.contains(nums[i]-1))
            {
                continue;
            }
            else
            {
                int temp_count = 1;
                while(answer.contains(nums[i]+1))
                {
                    temp_count++;
                    nums[i]++;
                }
                count = Math.max(count,temp_count);
            }
        }
        return count;
    }
}
