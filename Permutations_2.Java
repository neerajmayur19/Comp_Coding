class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(0,nums.length,nums,ans);
        return ans;
    }
    public void permutation(int left, int right, int[] nums, List<List<Integer>> temp)
    {
        if(left==right)
        {
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            ans.add(nums[i]);
            if(!(temp.contains(ans)))
            temp.add(new ArrayList<>(ans));
            return;
        }
        for(int i=left;i<nums.length;i++)
        {
            swap(left,i,nums);
            permutation(left+1,right,nums,temp);
            swap(left,i,nums);
        }
    }
    public void swap(int a, int b, int[] arr)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
