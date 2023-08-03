class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[10];
        permutation(nums,freq,temp,ans);
        return ans;
    }
    public void permutation(int[] nums, boolean[] freq, List<Integer> temp, List<List<Integer>> ans)
    {
        if(temp.size() == nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(freq[i]==false)
            {
                temp.add(nums[i]);
                freq[i] = true;
                permutation(nums,freq,temp,ans);
                freq[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
}
