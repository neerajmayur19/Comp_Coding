class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pos = new int[2];
        int i;
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        for(i=0;i<nums.length;i++)
        {
            if(temp.containsKey(target - nums[i]))
            {
                pos[0] = temp.get(target-nums[i]);
                break;
            }
            else
            {
                temp.put(nums[i],i);
            }
        }
        pos[1] = i;
        return pos;
    }
}
