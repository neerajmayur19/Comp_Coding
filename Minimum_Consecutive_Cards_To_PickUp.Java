import java.util.HashMap;
class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = cards.length + 1;
        for(int i=0;i<cards.length;i++)
        {
            if(map.containsKey(cards[i]))
            {
                min = Math.min(min,i-map.get(cards[i])+1);
            }
            map.put(cards[i],i);
        }
        if(min == cards.length + 1)
        {
            return -1;
        }
        else
        {
            return min;
        }
    }
}
