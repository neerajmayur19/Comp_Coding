class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> t1 = new ArrayList<>();
        String[] temp = new String[strs.length];
        int[] visited = new int[strs.length];
        for(int i=0;i<strs.length;i++)
        {
            temp[i] = strs[i];
            strs[i] = sorting(strs[i]);
        }
        for(int i=0;i<strs.length;i++)
        {
            if(visited[i]==1)
            continue;
            List<String> t = new ArrayList<>();;
            t.add(temp[i]);
            visited[i]=1;
            for(int j=i+1;j<strs.length;j++)
            {
                if(strs[i].equals(strs[j]) && visited[j]!=1)
                {
                    visited[j] = 1;
                    t.add(temp[j]);
                }
            }
            t1.add(new ArrayList<>(t));
        }
        return t1;
    }
    public String sorting(String str)
    {
        char[] temparray = str.toCharArray();
        Arrays.sort(temparray);
        return new String(temparray);
    }
}
