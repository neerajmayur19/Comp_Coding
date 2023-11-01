class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointer = 0;
        int max_count = s.length()==0?0:1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();)
        {
            if(map.containsKey(s.charAt(i)))
            {
                max_count = Math.max(i-pointer,max_count);
                pointer = Math.max(pointer,map.get(s.charAt(i))+1);
                map.remove(s.charAt(i));
            }
            else
            {
                map.put(s.charAt(i),i);
                i++;
                max_count = Math.max(i-pointer,max_count);
            }
        }
        return max_count;
    }
}
