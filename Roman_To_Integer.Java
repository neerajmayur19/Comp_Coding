class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int i=0;
        while(i<s.length())
        {
            if(i<s.length()-1 && s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X'))
            {
                sum += value(s.substring(i,i+2));
                i = i+2;
            }
            else if(i<s.length()-1 && s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C'))
            {
                sum += value(s.substring(i,i+2));
                i = i+2;
            }
            else if(i<s.length()-1 && s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M'))
            {
                sum += value(s.substring(i,i+2));
                i = i+2;
            }
            else
            {
                sum += value(s.substring(i,i+1));
                i++;
            }
            System.out.println(i);
            
        }
        return sum;
        
    }
    public int value(String s)
    {
        int a = 0;
        if(s.equals("I"))
        a = 1;
        else if(s.equals("V"))
        return 5;
        else if(s.equals("X"))
        return 10;
        else if(s.equals("L"))
        return 50;
        else if(s.equals("C"))
        return 100;
        else if(s.equals("D"))
        return 500;
        else if(s.equals("M"))
        return 1000;
        else if(s.equals("IV"))
        return 4;
        else if(s.equals("IX"))
        return 9;
        else if(s.equals("XL"))
        return 40;
        else if(s.equals("XC"))
        return 90;
        else if(s.equals("CD"))
        return 400;
        else if(s.equals("CM"))
        return 900;
        return a;
    }
}
