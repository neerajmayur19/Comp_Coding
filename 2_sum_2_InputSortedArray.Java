class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] pos = new int[2];
        int i;
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        for(i=0;i<numbers.length;i++)
        {
            if(temp.containsKey(target - numbers[i]))
            {
                pos[0] = temp.get(target-numbers[i])+1;
                break;
            }
            else
            {
                temp.put(numbers[i],i);
            }
        }
        pos[1] = i+1;
        return pos;
    }
}
