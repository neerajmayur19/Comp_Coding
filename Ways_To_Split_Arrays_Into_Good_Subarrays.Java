class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;
        long product = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                ans.add(i);
            }
        }
        if(ans.size()==0)
        {
            return 0;
        }
        else if(ans.size()==1)
        {
            return 1;
        }
        else if(ans.size()>1)
        {
            for(int i=1;i<ans.size();i++)
            {
                System.out.println(product);
                product *= (ans.get(i)-ans.get(i-1));
                product %= 1000000007;
            }
        }
        return (int)product;
    }
}
