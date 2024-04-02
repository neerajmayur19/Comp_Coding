class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int i=0;i<stones.length;i++)
        {
            map.put(stones[i],new HashSet<>());
        }
        return final_choice(stones,map);
    }
    public boolean final_choice(int[] stones, HashMap<Integer,HashSet<Integer>> answer)
    {
        answer.get(0).add(1);
        for(int i=0;i<stones.length;i++)
        {
            int element = stones[i];
            if(answer.get(element)==null)
            break;
            for(int item: answer.get(element))
            {
                if(answer.containsKey(element+item))
                {
                    if(item-1>0)
                    answer.get(element+item).add(item-1);
                    if(item>0)
                    answer.get(element+item).add(item);
                    if(item+1>0)
                    answer.get(element+item).add(item+1);
                }
            }
        }
        int element = stones[stones.length-1];
        return (answer.get(element).size()>0)?true:false;
    }
}
