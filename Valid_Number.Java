class Solution {
    public boolean isNumber(String s) {
        boolean decimal = false;
        boolean num_seen = false;
        int i = 0;
        if(s.charAt(i)=='+' || s.charAt(i)=='-')
        {
            i += 1;
        }
        while(i<s.length())
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                if(s.charAt(i)!='e' && s.charAt(i)!='E')
                return false;
                else
                return (num_seen && isValid(s.substring(i+1,s.length())));
            }
            else if(s.charAt(i)=='.')
            {
                if(decimal==false)
                decimal = true;
                else
                return false;
            }
            else if(s.charAt(i)=='+' || s.charAt(i)=='-')
            {
                return false;
            }
            else
            {
                num_seen = true;
            }
            i++;
        }
        return num_seen;
    }
    public boolean isValid(String s)
    {
        if(s.length()==0)
        return false;
        
        
        int i = 0;
        boolean num_seen = false;
        if(s.charAt(i)=='+' || s.charAt(i)=='-')
        i += 1;
        while(i < s.length())
        {
            if(Character.isDigit(s.charAt(i)))
            {
                num_seen = true;
            }
            else
            return false;
            i++;
        }
        return num_seen;
    }
}
