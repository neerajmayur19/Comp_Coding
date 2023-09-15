class Solution {
    public void nextPermutation(int[] nums) {
        int pos = -1,min = Integer.MAX_VALUE,max = nums.length-1;
        int min_pos = nums.length;
        int i;
// Here, it starts from the right-most part of the array and see which element has atleast one element that is greater than itself
        for(i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>=nums[max])
            {
                max = i;
            }
            else
            {
                pos = i;
                break;
            }
        }
//Once finding the position of such element, find the element right to the array which is greater than this element but smaller than every other element in the right.
        if(i>=0)
        {
            for(i=max;i<nums.length;i++)
            {
                if(nums[i]<min && nums[i]>nums[pos])
                {
                    min = nums[i];
                    min_pos = i;
                }
            }
            int temp_position = pos;
            swap(nums,pos,min_pos);
// Sort all the elements to the right of the array.
            mergesort(nums,temp_position+1,nums.length-1);
        }
        else
        {
            Arrays.sort(nums);
        }
    }
    public void swap(int[] nums,int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void mergesort(int[] nums, int left, int right)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            mergesort(nums,left,mid);
            mergesort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    public void merge(int[] nums, int left, int mid, int right)
    {
        int i = left;
        int j = mid+1;
        List<Integer> temp = new ArrayList<Integer>();
        while(i<=mid && j<=right)
        {
            if(nums[i]<=nums[j])
            {
                temp.add(nums[i]);
                i++;
            }
            else
            {
                temp.add(nums[j]);
                j++;
            }
        }
        while(i<=mid)
        {
            temp.add(nums[i]);
            i++;
        }
        while(j<=right)
        {
            temp.add(nums[j]);
            j++;
        }
        int k = 0;
        for(int a=left;a<=right;a++)
        {
            nums[a] = temp.get(k);
            k++;
        }
    }
}
