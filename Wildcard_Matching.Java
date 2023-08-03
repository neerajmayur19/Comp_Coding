class Solution {
    public boolean isMatch(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        return (match(lenp-1,lens-1,p,s));
    }
    public boolean match(int i, int j, String p, String s)
    {
        if(i<0 && j<0)
        return true;
        if(i<0 && j>=0)
        return false;
        if(j<0 && i>=0)
        {
            for(int l=i;l>=0;l--)
            {
                if(p.charAt(l)!='*')
                return false;
            }
            return true;
        }
        if(p.charAt(i)==s.charAt(j) || p.charAt(i)=='?')
        return match(i-1,j-1,p,s);
        if(p.charAt(i)=='*')
        return (match(i-1,j,p,s) | match(i,j-1,p,s));
        return false;
    }
};
