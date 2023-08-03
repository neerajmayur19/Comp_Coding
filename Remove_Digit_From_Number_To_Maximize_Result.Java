class Solution {
    public String toString(char a[])
    {
        String temp = new String(a);
        return temp;
    }
    public String removeDigit(String number, char digit) {
        String temp;
        int i;
        int index = 0;
        for(i=0;i<number.length();i++)
        {
            if(number.charAt(i) == digit)
            {
                index = i;
                if(i<(number.length()-1) && digit < number.charAt(i+1))
                {
                    break;
                }
            }
        }
        temp = number.substring(0,index) + number.substring(index+1);
        return temp;
    }
}
