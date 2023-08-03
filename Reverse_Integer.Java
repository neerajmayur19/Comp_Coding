class Solution {
    public int reverse(int x) {
        int rem = 0;
        // Makes use of the long and integer datatype and checks if the final sum computed is same in both the cases and if it is, then the number is within the range.
        long sum1 = 0;
        int sum = 0;
        long temp = x;
        int count = 0;
        boolean stat = true;
        if(x<0)
        {
            stat = false;
            x *= (-1);
        }
        while(x>0)
        {
            rem = x%10;
            sum = (sum*10)+rem;
            sum1 = (sum1*10)+rem;
            x = x/10;
        }
        if(stat == false)
        {
            sum *= -1;
            sum1 *= -1;
        }
        // One more method would have been to check if the computed sum is greater than Integer.MAX_VALUE and lesser than Integer.MIN_VALUE;
        if(sum1==sum)
        return sum;
        else
        return 0;
    }
}
