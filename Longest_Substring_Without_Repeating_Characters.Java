class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count;
        if(s.length()>0)
        {
        count = 1;
        }
        else
        {
            count = 0;
        }
        int tcount = 0;
        HashSet<Character> temp = new HashSet<Character>();
        // This method has a time complexity of O(n^2) but the same can be done using hashsets with a time complexity of O(n) using sliding window technique
        // Refer the solutions for the same
        for(int i=0;i<s.length();i++)
        {
            temp.add(s.charAt(i));
            tcount++;
            for(int j=i+1;j<s.length();j++)
            {
                if(temp.contains(s.charAt(j)))
                {
                    temp.clear();
                    tcount = 0;
                    break;
                }
                else
                {
                    temp.add(s.charAt(j));
                    tcount++;
                }
                count = Math.max(tcount,count);
            }
        }
        return count;
    }
}
