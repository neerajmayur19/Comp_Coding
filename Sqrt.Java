class Solution {
    public int mySqrt(int x) {
        // This is the brute force solution 
        // To optimize this use the binary search method
        int value = 0,i=0;
        if(x==Integer.MAX_VALUE)
        return 46340;
        for(i=0;i<=46340;i++)
        {
            value = i*i;
            if(value>=x)
            break;
        }
        if(value>x)
        return (i-1);
        else
        return i;
    }
}
