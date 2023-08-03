class Solution {
    public String multiply(String num1, String num2) {
        String result = "";
        if(num1.equals("0") || num2.equals("0"))
        return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int[] a = new int[len1+len2];
        int i = len2-1;
        int j;
        int pf = 0;
        while(i>=0)
        {
            int val1 = num2.charAt(i) - '0';
            i--;

            j = len1-1;
            int k = a.length - 1 - pf;
            int carry = 0;

            while(carry!=0 || j>=0)
            {
                int val2 = (j>=0)?(num1.charAt(j)-'0'):0;
                j--;

                int product = val1 * val2 + carry + a[k];
                a[k] = product % 10;
                carry = product/10;
                k--;
            }
            pf++;
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                for(j=i;j<a.length;j++)
                {
                    result += Integer.toString(a[j]);
                }
                break;
            }
        }
        return result;
    }
}
