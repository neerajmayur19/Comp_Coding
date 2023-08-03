class Solution {
    public int punishmentNumber(int n) {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(value(0,i,0,Integer.toString(i*i)))
            count += (i*i);
        }
        return count;
    }
    public boolean value(int index,int n,int s,String s1)
    {
        if(index==s1.length())
        {
            if(s==n)
            return true;
            else
            return false;
        }
        for(int i=index;i<s1.length();i++)
        {
            if(value(i+1,n,s+Integer.valueOf(s1.substring(index,i+1)),s1))
            return true;
        }
        return false;
    }
}
