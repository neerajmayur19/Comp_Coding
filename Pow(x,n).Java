class Solution {
    public double myPow(double x, int n) {
        // This is recursive binary approach using a time complexity of O(log n):
        boolean stat = false;
        if(x==0)
        return 0;
        if(n==0)
        return 1;
        if(x==1)
        return 1;
        if(x==-1)
        {
            if(n%2 != 0)
            return -1;
            else 
            return 1;
        }
        if(n<0)
        {
            stat = true;
            n *= -1;
        }
        double value = calculate_power(x,n);
        if(stat==true)
        return 1/value;
        else 
        return value;
    }
    public double calculate_power(double x, int n)
    {
        if(n==0)
        return 1;
        double power = calculate_power(x,n/2);
        if(n%2==0)
            return power*power;
        else
            return x*power*power;
    }
}
