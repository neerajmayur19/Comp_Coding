public class Solution {
    public int solve(int[] A, int B) {
        int value = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(value,1);
        int count = 0;
        for(int i=0;i<A.length;i++)
        {
            value = value ^ A[i];
            int x = value^B;
            if(map.containsKey(x))
            {
                count += map.get(x);
            }
            if(map.containsKey(value))
            {
                map.put(value,map.get(value)+1);
            }
            else
            {
                map.put(value,1);
            }
        }
        return count;
    }
}
