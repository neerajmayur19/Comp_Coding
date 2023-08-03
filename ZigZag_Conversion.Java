class Solution {
    public String convert(String s, int numRows) {
        int minvalue = (numRows-1) + (numRows-2) + 1;
        String[] arr = new String[numRows+1];
        String temp = "";
        int count = 0;
        int clock = 0;
        int tmv1 = minvalue;
        int tmv2 = 0;
        if(s.length()==1 || numRows==1)
        {
            return s;
        }
        if(s.length()>1)
        {
            for(int i=1;i<=numRows;i++)
            {
                count = i-1;
                arr[i] = "";
                if(i!=1 && i!=numRows)
                {
                    clock = 0;
                    if(tmv1 % 2 == 0)
                    {
                        tmv1 -= 2;
                    }
                    else
                    {
                        tmv1 -= 1;
                    }
                    tmv2 += 2;
                    while(count<s.length())
                    {
                        arr[i] += s.charAt(count);
                        count = (clock%2)==0?count+tmv1:count+tmv2;
                        clock++;
                    }
                }
                else
                {
                    while(count<s.length())
                    {
                        arr[i] += s.charAt(count);
                        count += minvalue;
                    }
                }
            }
        }
        for(int i=1;i<=numRows;i++)
        {
            temp += arr[i];
        }
        return temp;
    }
}
