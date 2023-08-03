class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == 1)
        return (-2147483648);
        if(dividend==divisor)
        return 1;
        long a = dividend;
        long b = divisor;
        boolean stat = ((a>=0)==(b>=0));
        int ans = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        while(a>=b)
        {
            int q = 0;
            while(a >= (b<<(q+1)))
            q++;
            ans += (1<<q);
            a -= (b<<q);
        }
        if(ans <= Integer.MIN_VALUE || ans > Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
        ans = (stat)?ans:-ans;
        return ans;
    }
}
