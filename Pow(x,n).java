class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long number = n;
        if(number<0)
        {
            number *= -1;
        }
        while(number > 0)
        {
            if(number % 2==0)
            {
                x = x*x;
                number = number/2;
            }
            else
            {
                ans = ans*x;
                number = number - 1;
            }
        }
        if(n<0)
        {
            ans = (double)1.0/(double)ans;
        }
        return ans;
    }
}
