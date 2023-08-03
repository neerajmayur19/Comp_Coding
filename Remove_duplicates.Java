class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int starting_value = nums[0];
        int final_value = nums[nums.length-1];
        int k = 0;
        for(int i=starting_value;i<=final_value;i++)
        {
            if(map.containsKey(i))
            {
                if(map.get(i)==1)
                {
                    nums[k] = i;
                    k++;
                }
                else if(map.get(i)>=2)
                {
                    nums[k] = i;
                    k++;
                    nums[k] = i;
                    k++;
                }
            }
        }
        return k;
    }
}
