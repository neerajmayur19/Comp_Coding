class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> temp = new ArrayList<>();
        int lens = s.length();
        int m = words.length;
        int n = words[0].length();
        m *= n;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            if(!map.containsKey(words[i]))
            map.put(words[i],1);
            else
            map.put(words[i],map.get(words[i])+1);
        }
        for(int i=0;i<=(lens-m);i++)
        {
            HashMap<String,Integer> temp1 = new HashMap<String,Integer>(map);
            for(int j=0;j<words.length;j++)
            {
                String s1 = s.substring(i + j*n,i + j*n + n);
                if(temp1.containsKey(s1))
                {
                    int count = temp1.get(s1);
                    if(count==1)
                    temp1.remove(s1);
                    else
                    temp1.put(s1,count-1);
                    if(temp1.isEmpty())
                    {
                        temp.add(i);
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        return temp;
    }
}
