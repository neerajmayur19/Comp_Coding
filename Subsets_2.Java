class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> t1 = new ArrayList<Integer>();
        List<List<Integer>> t = new ArrayList<>();
        ssum(0,nums,t1,t);
        return t;
    }
    public void ssum(int index, int[] nums, List<Integer> t1, List<List<Integer>> t)
    {
        t.add(new ArrayList<>(t1));
        for(int i=index;i<nums.length;i++)
        {
            if((i != index) && (nums[i]==nums[i-1]))
            continue;
            t1.add(nums[i]);
            ssum(i+1,nums,t1,t);
            t1.remove(t1.size()-1);
        }
    }
}
