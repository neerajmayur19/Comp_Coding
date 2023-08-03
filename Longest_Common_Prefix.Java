class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp = "";
        // To check whether the array contains any null string
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()==0)
            return temp;
        }                  
        if(strs.length==1)// If the array contains only one string, then the string is returned as itself
        {
            return strs[0];
        }
        int limit = 0;
        // The pattern is checked in the first two strings using the limit to note down the index
        for(int i=0;i<Math.min(strs[0].length(),strs[1].length());i++)
        {
            if(strs[0].charAt(i)==strs[1].charAt(i))
            {
                limit++;
            }
            else
            {
                break;
            }
        }
        int tlimit = 0;
        // The same process for the remaining strings in the array
        if(limit>0 && strs.length>2)
        {
            for(int i=2;i<strs.length;i++)
            {
                for(int j=0;j<Math.min(limit,Math.min(strs[i].length(),strs[i-1].length()));j++)
                {
                    if((strs[i].charAt(j) == strs[i-1].charAt(j)))
                    {
                        tlimit++;
                    }
                    else
                    {
                        break;
                    }
                }
                if(tlimit==0)
                {
                    limit = 0; //If at any point the pattern breaks, null is returned as the answer.
                    break;
                }
                limit = tlimit;
                tlimit = 0;
            }
        }
        for(int i=0;i<limit;i++)
        {
            temp += strs[0].charAt(i);
        }
        return temp;
    }
}
