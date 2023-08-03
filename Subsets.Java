class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> t1 = new ArrayList<>();
        List<List<Integer>> t = new ArrayList<>();
        powerset(0,nums,t1,t);
        return t;
    }
    void powerset(int index, int[] nums, List<Integer> t1, List<List<Integer>> t)
    {
        if(index == nums.length)
        {
            t.add(new ArrayList<>(t1));
            return;
        }
        t1.add(nums[index]);
        powerset(index+1,nums,t1,t);
        t1.remove(t1.size() - 1);
        powerset(index+1,nums,t1,t);
    }
}
