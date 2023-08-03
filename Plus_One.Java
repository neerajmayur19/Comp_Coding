class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length + 1;
        int[] updated_array = new int[n];
        int sum = 0;
        int carry = 0;
        int value;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(i==digits.length-1)
            value = digits[i]+1+carry;
            else
            value = digits[i]+carry;
            sum = value%10;
            carry = value/10;
            updated_array[i+1] = sum;
        }
        if(carry!=0)
        {
            updated_array[0] = carry;
            return updated_array;
        }
        else
        {
            copy(updated_array,digits);
            return digits;
        }
    }
    public void copy(int[] a, int[] b)
    {
        for(int i=0;i<b.length;i++)
        {
            b[i] = a[i+1];
        }
    }
}
