class Solution {
    public int reversePairs(int[] nums) {
        return merge(nums,0,nums.length-1);
    }
    public int merge(int[] nums, int low, int high)
    {
        int count = 0;
        if(low<high)
        {
            int mid = (low+high)/2;
            count += merge(nums,low,mid);
            count += merge(nums,mid+1,high);
            count += mergesort(nums,low,mid,high);
        }
        return count;
    }
    public int mergesort(int[] nums, int low, int mid, int high)
    {
        int i=low,j=mid+1,count=0;
        while(i<=mid && j<=high)
        {
            long value = (long)2*nums[j];
            System.out.println(value);
            while(i<=mid && nums[i]<=value)
            {
                i++;
            }
            if(i<=mid)
            {
                count += (mid-i)+1;
            }
            j++;
        }
        i=low;
        j=mid+1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(i<=mid && j<=high)
        {
            if(nums[i]<=nums[j])
            {
                ans.add(nums[i]);
                i++;
            }
            else
            {
                ans.add(nums[j]);
                j++;
            }
        }
        while(i<=mid)
        {
            ans.add(nums[i]);
            i++;
        }
        while(j<=high)
        {
            ans.add(nums[j]);
            j++;
        }
        int k = 0;
        for(i=low;i<=high;i++)
        {
            nums[i] = ans.get(k);
            k++;
        }
        return count;
    }
}
