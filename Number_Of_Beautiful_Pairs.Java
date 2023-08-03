class Solution {
    public int countBeautifulPairs(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        set_values(map);
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                String a = Integer.toString(nums[i]);
                int num1 = a.charAt(0)-'0';
                int num2 = nums[j]%10;
                int value1 = num1*10 + num2;
                if(map.contains(value1))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public void set_values(HashSet<Integer> map)
    {
        map.add(0*10 + 1);
        map.add(1*10 + 1);
        map.add(1*10 + 2);
        map.add(1*10 + 3);
        map.add(1*10 + 4);
        map.add(1*10 + 5);
        map.add(1*10 + 6);
        map.add(1*10 + 7);
        map.add(1*10 + 8);
        map.add(1*10 + 9);
        map.add(2*10 + 3);
        map.add(2*10 + 5);
        map.add(2*10 + 7);
        map.add(2*10 + 9);
        map.add(3*10 + 4);
        map.add(3*10 + 5);
        map.add(3*10 + 7);
        map.add(3*10 + 8);
        map.add(4*10 + 5);
        map.add(4*10 + 7);
        map.add(4*10 + 9);
        map.add(5*10 + 6);
        map.add(5*10 + 7);
        map.add(5*10 + 8);
        map.add(5*10 + 9);
        map.add(6*10 + 7);
        map.add(7*10 + 8);
        map.add(7*10 + 9);
        map.add(8*10 + 9);
        map.add(1*10 + 0);
        map.add(2*10 + 1);
        map.add(3*10 + 1);
        map.add(4*10 + 1);
        map.add(5*10 + 1);
        map.add(6*10 + 1);
        map.add(7*10 + 1);
        map.add(8*10 + 1);
        map.add(9*10 + 1);
        map.add(3*10 + 2);
        map.add(5*10 + 2);
        map.add(7*10 + 2);
        map.add(9*10 + 2);
        map.add(4*10 + 3);
        map.add(5*10 + 3);
        map.add(7*10 + 3);
        map.add(8*10 + 3);
        map.add(5*10 + 4);
        map.add(7*10 + 4);
        map.add(9*10 + 4);
        map.add(6*10 + 5);
        map.add(7*10 + 5);
        map.add(8*10 + 5);
        map.add(9*10 + 5);
        map.add(7*10 + 6);
        map.add(8*10 + 7);
        map.add(9*10 + 7);
        map.add(9*10 + 8);
    }
}
