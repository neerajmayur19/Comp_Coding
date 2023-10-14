class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        int count1 = 0, ele1 = Integer.MAX_VALUE;
        int count2 = 0, ele2 = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(count1==0 && ele2 != nums[i])
            {
                count1++;
                ele1 = nums[i];
            }
            else if(count2==0 && ele1 != nums[i])
            {
                count2++;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i])
            {
                count1++;
            }
            else if(ele2 == nums[i])
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==ele1)
            count1++;
            else if(nums[j]==ele2)
            count2++;
        }
        System.out.println(ele1 + " "+ count1);
        System.out.println(ele2 + " " + count2);
        if(count1>(nums.length/3))
        answer.add(ele1);
        if(count2>(nums.length/3))
        answer.add(ele2);
        return answer;
    }
}
