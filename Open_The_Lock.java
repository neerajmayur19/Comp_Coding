class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> deads = new HashSet<String>(Arrays.asList(deadends));
        if(deads.contains("0000"))
        return -1;
        HashSet<String> visited = new HashSet<String>();
        Queue<Pair<String,Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>("0000",0));
        while(!(queue.isEmpty()))
        {
            Pair<String,Integer> temp = queue.poll();
            if(temp.getKey().equals(target))
            return temp.getValue();
            String str = temp.getKey();
            for(int i=0;i<4;i++)
            {
                int value = str.charAt(i)-'0'+10;
                int temp1 = value+1;
                int temp2 = value-1;
                String str1 = str.substring(0,i) + temp1%10 + str.substring(i+1);
                if(!(deads.contains(str1) || visited.contains(str1)))
                {
                    queue.offer(new Pair<>(str1,temp.getValue()+1));
                    visited.add(str1);
                }
                String str2 = str.substring(0,i) + temp2%10 + str.substring(i+1);
                if(!(deads.contains(str2) || visited.contains(str2)))
                {
                    queue.offer(new Pair<>(str2,temp.getValue()+1));
                    visited.add(str2);
                }
                
            }
        }
        return -1;
    }
}
