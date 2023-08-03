class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        HashMap<Integer,Character> direction = new HashMap<>();
        HashMap<Integer,Integer> original_positions = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int max = positions[0];
        for(int i=0;i<positions.length;i++)
        {
            direction.put(positions[i],directions.charAt(i));
            original_positions.put(positions[i],i);
            max = Math.max(max,positions[i]);
        }
        Arrays.sort(positions);
        Stack<Integer> robots = new Stack<>();
        answer(positions,healths,direction,original_positions,robots);
        find_ans(ans,healths);
        return ans;
    }
    public void answer(int[] positions,int[] healths ,HashMap<Integer,Character> direction,HashMap<Integer,Integer> original_positions,Stack<Integer> robots)
    {
        for(int i=0;i<positions.length;i++)
        {
            int current = 1;
            while(current != 0)
            {
                if(direction.get(positions[i])=='R')
                {
                    robots.push(positions[i]);
                    current = 0;
                }
                else
                {
                    if(robots.isEmpty() || direction.get(robots.peek())=='L')
                    {
                        robots.push(positions[i]);
                        current = 0;
                    }
                    else if(direction.get(robots.peek())=='R')
                    {
                        int x = original_positions.get(robots.peek());
                        int y = original_positions.get(positions[i]);
                         if(healths[x] < healths[y])
                        {
                            robots.pop();
                            healths[y]--;
                            healths[x] = 0;
                            current = 1;
                        }
                        else if(healths[x] > healths[y])
                        {
                            healths[x]--;
                            healths[y] = 0;
                            current = 0;
                        }
                        else
                        {
                            robots.pop();
                            healths[x] = 0;
                            healths[y] = 0;
                            current = 0;
                        }
                    }
                }
            }
        }
    }
    public void find_ans(ArrayList<Integer> ans,int[] healths)
    {
        for(int i=0;i<healths.length;i++)
        {
            if(healths[i] != 0)
            {
                ans.add(healths[i]);
            }
        }
    }
}
