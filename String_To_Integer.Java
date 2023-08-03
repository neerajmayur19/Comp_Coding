class Solution {
    public int myAtoi(String s) {
        int sum = 0;
        long sum1 = 0;
        int count = s.length();
        boolean stat = true;
        boolean digit = true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ' && digit == true)
            continue;
            else if(Character.isDigit(s.charAt(i)))
            {
                sum = sum*10 + (s.charAt(i)-'0');
                sum1 = sum1*10 + (s.charAt(i)-'0');
                if(sum!=sum1)
                {
                    if(stat==true)
                    {
                        sum = (int)(Math.pow(2,31)-1);
                        sum1 = (int)(Math.pow(2,31)-1);
                        break;
                    }
                    else
                    {
                        sum = (int)Math.pow(2,31);
                        sum++;
                        sum1 = (int)Math.pow(2,31);
                        sum1++;
                        break;
                    }
                }
                digit = false;
            }
            else if(s.charAt(i)== '-' && digit == true)
            {
                stat = false;
                digit = false;
            }
            else if(s.charAt(i)== '+' && digit == true)
            {
                digit = false;
            }
            else
            {
                digit = false;
                break;
            }
        }
        if(sum != sum1)
        {
            if(stat == false)
            {
            sum = (int)Math.pow(2,31);
            sum++;
            sum *= -1;
            }
            else
            {
                sum = (int)(Math.pow(2,31)-1);
            }
        }
        else if(sum==sum1)
        {
            if(stat == false)
            sum *= -1;
            if(s.length()>=18 && digit == true && stat == true)
            sum = (int)(Math.pow(2,31)-1);
        }
        return sum;
    }
}
