public class Solution {
    public static int NthRoot(int n, int m) {
        if(m==1 && n==1)
        return 1;
        if(m==1)
        return -1;
        // Write your code here.
        long first = 1;
        long last = m;
        long mid = 0;
        while(first<=last)
        {
            mid = first + (last-first)/2;
            if(Math.pow(mid,n)==m)
            return (int)mid;
            else
            {
                if(Math.pow(mid,n)>m)
                last = mid-1;
                else
                first = mid+1;
            }
        }
        return -1;
    }
}
